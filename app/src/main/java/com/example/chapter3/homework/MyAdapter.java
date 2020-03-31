package com.example.chapter3.homework;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    private static final int NUM_LIST_ITEMS = 10;

    @Override
    public int getCount() {
        return NUM_LIST_ITEMS;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv = null;
        if (convertView == null) {
            convertView = View.inflate(parent.getContext(), R.layout.list_item, null);
            tv = convertView.findViewById(R.id.tv_item);
            convertView.setTag(tv);
        } else {
            tv = (TextView) convertView.getTag();
        }

        tv.setText(new StringBuilder("item: "+position));

        return convertView;
    }
}
