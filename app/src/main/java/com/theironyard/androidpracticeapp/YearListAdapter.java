package com.theironyard.androidpracticeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by alhanger on 3/6/16.
 */
public class YearListAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Year> years;
    private LayoutInflater inflater = null;

    public YearListAdapter(Context context, ArrayList<Year> data) {
        mContext = context;
        years = data;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return years.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        return view;
    }
}
