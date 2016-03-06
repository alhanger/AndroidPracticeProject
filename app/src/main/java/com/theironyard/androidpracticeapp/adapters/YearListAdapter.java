package com.theironyard.androidpracticeapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.theironyard.androidpracticeapp.R;
import com.theironyard.androidpracticeapp.entities.Year;

/**
 * Created by alhanger on 3/6/16.
 */
public class YearListAdapter extends BaseAdapter {

    private Context mContext;
    private Year[] years;
    private LayoutInflater inflater = null;

    public YearListAdapter(Context context, Year[] data) {
        mContext = context;
        years = data;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return years.length;
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
            view = inflater.inflate(R.layout.year_list, null);

            TextView year = (TextView) view.findViewById(R.id.year);

            Year mYear = new Year();

            year.setText(mYear.toString());
        }

        return view;
    }
}
