package com.theironyard.androidpracticeapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.theironyard.androidpracticeapp.entities.Show;


/**
 * Created by alhanger on 3/7/16.
 */
public class ShowListAdapter extends BaseAdapter {

    private Context mContext;
    private Show[] shows;
    private LayoutInflater inflater = null;

    public ShowListAdapter(Context context, Show[] data) {
        mContext = context;
        shows = data;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return shows.length;
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

        if (convertView == null) {

        }

        return view;
    }
}
