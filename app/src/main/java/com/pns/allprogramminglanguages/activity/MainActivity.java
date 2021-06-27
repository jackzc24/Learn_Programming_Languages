package com.pns.allprogramminglanguages.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.pns.allprogramminglanguages.R;

public class MainActivity extends AppCompatActivity {

    private GridLayout gridLayout;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridLayout = findViewById(R.id.main_activity_grid_layout);
        ImageView c = findViewById(R.id.option_c);
        ImageView cPlus = findViewById(R.id.option_c_plus);
        ImageView java = findViewById(R.id.option_java);
        ImageView kotlin = findViewById(R.id.option_kotlin);
        ImageView python = findViewById(R.id.option_python);
        ImageView android = findViewById(R.id.option_android);

        boolean isGridShow = getSharedPreferences("PREFS", MODE_PRIVATE).getBoolean("show", true);

        if (isGridShow)
            gridLayout.setVisibility(View.VISIBLE);
        else
            gridLayout.setVisibility(View.INVISIBLE);

        c.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ListActivity.class);
            intent.putExtra("title", "C");
            startActivity(intent);
        });

        cPlus.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ListActivity.class);
            intent.putExtra("title", "C++");
            startActivity(intent);
        });

        java.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ListActivity.class);
            intent.putExtra("title", "Java");
            startActivity(intent);
        });

        kotlin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ListActivity.class);
            intent.putExtra("title", "Kotlin");
            startActivity(intent);
        });

        python.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ListActivity.class);
            intent.putExtra("title", "Python");
            startActivity(intent);
        });

        android.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ListActivity.class);
            intent.putExtra("title", "Android");
            startActivity(intent);
        });
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public void ver(View v) {

        boolean value = getSharedPreferences("PREFS", MODE_PRIVATE).getBoolean("show", true);

        if (value) {

            gridLayout.setVisibility(View.INVISIBLE);

            SharedPreferences.Editor editor = getSharedPreferences("PREFS", MODE_PRIVATE).edit();
            editor.putBoolean("show", false);
            editor.apply();

        } else {

            gridLayout.setVisibility(View.VISIBLE);

            SharedPreferences.Editor editor = getSharedPreferences("PREFS", MODE_PRIVATE).edit();
            editor.putBoolean("show", true);
            editor.apply();
        }
    }
}