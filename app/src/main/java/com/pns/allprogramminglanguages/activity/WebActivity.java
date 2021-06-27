package com.pns.allprogramminglanguages.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.pns.allprogramminglanguages.R;

import java.util.Random;

public class WebActivity extends AppCompatActivity {

    private WebView webView;
    private ProgressBar roundProgressBar;
    private ProgressBar horizontalProgressBar;
    private RelativeLayout webLayout;
    private ImageView refresh;
    private InterstitialAd mInterstitialAd;
    private int i;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Toolbar toolbar = findViewById(R.id.web_activity_toolbar);
        setSupportActionBar(toolbar);

        roundProgressBar = findViewById(R.id.web_activity_circle_progress);
        refresh = findViewById(R.id.web_activity_refresh);
        webLayout = findViewById(R.id.error_layout);
        ImageView left = findViewById(R.id.web_activity_left);
        ImageView back = findViewById(R.id.web_activity_back);
        ImageView right = findViewById(R.id.web_activity_right);
        TextView title = findViewById(R.id.web_activity_title);
        webView = findViewById(R.id.webView);
        horizontalProgressBar = findViewById(R.id.web_activity_horizontal_progress);
        horizontalProgressBar.setMax(100);

        String titleText = getIntent().getStringExtra("title");

        if(titleText != null ) {

            if (titleText.equals("Checkout another tutorials")) {

                titleText = "Android Tutorials";
            }

            title.setText(titleText);
        }

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.getSettings().setAppCacheEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSaveFormData(true);
        webView.getSettings().setAllowFileAccess(true);

        webView.loadUrl(getIntent().getStringExtra("url"));
        webView.setWebViewClient(new webViewClient());
        webView.setWebChromeClient(new ChromeClient());

        horizontalProgressBar.setProgress(0);

        refresh.setOnClickListener(v -> {

            if (isNotNetworkAvailable()) {

                if (getApplicationContext() != null)
                    Toast.makeText(WebActivity.this, "No Internet Connection ", Toast.LENGTH_LONG).show();

            } else {

                refresh.setVisibility(View.GONE);
                roundProgressBar.setVisibility(View.VISIBLE);
                webView.reload();
                i = 0;
            }

            new Handler().postDelayed(() -> {

                refresh.setVisibility(View.VISIBLE);
                roundProgressBar.setVisibility(View.GONE);
            }, 2000);
        });

        left.setOnClickListener(v -> {

            if (webView.canGoBack()) {
                webView.goBack();
            }
        });

        back.setOnClickListener(v -> onBackPressed());

        right.setOnClickListener(v -> {

            if (webView.canGoForward()) {
                webView.goForward();
            }
        });

        MobileAds.initialize(this, initializationStatus -> {
        });

        int n = new Random().nextInt(50);
        if (n == 24) {
            showAd();
        }
    }

    private void showAd() {

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this, "ca-app-pub-3268485322715704/6563685291", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                mInterstitialAd = interstitialAd;
                mInterstitialAd.show(WebActivity.this);
            }
        });
    }

    private static class webViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;
        }
    }

    private class ChromeClient extends WebChromeClient {
        private View mCustomView;
        private WebChromeClient.CustomViewCallback mCustomViewCallback;
        private int mOriginalOrientation;
        private int mOriginalSystemUiVisibility;

        ChromeClient() {
        }

        public Bitmap getDefaultVideoPoster() {
            if (mCustomView == null) {
                return null;
            }
            return BitmapFactory.decodeResource(getApplicationContext().getResources(), 2130837573);
        }

        public void onHideCustomView() {
            ((FrameLayout) getWindow().getDecorView()).removeView(this.mCustomView);
            this.mCustomView = null;
            getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
            setRequestedOrientation(this.mOriginalOrientation);
            this.mCustomViewCallback.onCustomViewHidden();
            this.mCustomViewCallback = null;
        }

        public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {
            if (this.mCustomView != null) {
                onHideCustomView();
                return;
            }
            this.mCustomView = paramView;
            this.mOriginalSystemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
            this.mOriginalOrientation = getRequestedOrientation();
            this.mCustomViewCallback = paramCustomViewCallback;
            ((FrameLayout) getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
            getWindow().getDecorView().setSystemUiVisibility(3846 | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        }

        @Override
        public void onProgressChanged(WebView view, int newProgress) {

            if (isNotNetworkAvailable()) {

                horizontalProgressBar.setVisibility(View.INVISIBLE);

                if (i == 0) {

                    i++;

                    if (getApplicationContext() != null) {

                        Toast.makeText(WebActivity.this, "No Internet Connection ", Toast.LENGTH_LONG).show();
                        webView.setVisibility(View.GONE);
                        webLayout.setVisibility(View.VISIBLE);
                    }
                }

                return;
            }

            i = 0;

            horizontalProgressBar.setProgress(newProgress);

            if (newProgress == 100) {

                horizontalProgressBar.setVisibility(View.INVISIBLE);
                webView.setVisibility(View.VISIBLE);
                webLayout.setVisibility(View.GONE);

            } else {

                horizontalProgressBar.setVisibility(View.VISIBLE);
            }

            super.onProgressChanged(view, newProgress);
        }
    }

    private boolean isNotNetworkAvailable() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (!(activeNetworkInfo != null && activeNetworkInfo.isConnected()));
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

}