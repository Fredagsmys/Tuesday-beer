package com.example.app3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;
    String[] description;
    String[] levels;

    public ItemAdapter(Context c, String[] i, String[] p, String[] d){
        this.items = i;
        this.description = p;
        this.levels = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.my_listview_detail,null);
        TextView TricksTextView = (TextView) v.findViewById(R.id.TricksTextView);
        TextView DescTextView = (TextView) v.findViewById(R.id.DescTextView);
        TextView LevelsTextView = (TextView) v.findViewById(R.id.LevelsTextView);

        String name = items[position];
        String desc = description[position];
        String level = levels[position];

        TricksTextView.setText(name);
        DescTextView.setText(desc);
        LevelsTextView.setText(level);

        return v;
    }
}
