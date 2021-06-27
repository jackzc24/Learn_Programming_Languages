package com.pns.allprogramminglanguages.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.pns.allprogramminglanguages.R;
import com.pns.allprogramminglanguages.Url;
import com.pns.allprogramminglanguages.activity.WebActivity;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class ListViewAdapter extends BaseExpandableListAdapter {

    private final ArrayList<String> categoryList;
    private final Map<String, ArrayList<String>> mapChild;
    private final Context context;
    private final String title;

    public ListViewAdapter(ArrayList<String> categoryList, Map<String, ArrayList<String>> mapChild, Context context, String title) {
        this.categoryList = categoryList;
        this.mapChild = mapChild;
        this.context = context;
        this.title = title;
    }

    @Override
    public int getGroupCount() {
        return categoryList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return Objects.requireNonNull(mapChild.get(categoryList.get(groupPosition))).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return categoryList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return Objects.requireNonNull(mapChild.get(categoryList.get(groupPosition))).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String categoryTitle = (String) getGroup(groupPosition);
        convertView = LayoutInflater.from(context).inflate(R.layout.list_view_group_layout, null);
        TextView textView = convertView.findViewById(R.id.list_group_text);
        textView.setText(categoryTitle);
        return convertView;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String childTitle = (String) getChild(groupPosition, childPosition);
        String url = Url.getUrl(groupPosition, childPosition, title);

        convertView = LayoutInflater.from(context).inflate(R.layout.list_view_child_layout, null);
        TextView textView = convertView.findViewById(R.id.list_child_text);
        textView.setText(childTitle);

        textView.setOnClickListener(v -> {

            Intent intent = new Intent(context, WebActivity.class);
            intent.putExtra("title", childTitle);
            intent.putExtra("url", url);
            context.startActivity(intent);

        });

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

}