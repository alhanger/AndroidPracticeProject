package com.theironyard.androidpracticeapp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.theironyard.androidpracticeapp.R;
import com.theironyard.androidpracticeapp.adapters.ShowListAdapter;

public class ShowActivity extends Activity {

    private ListView listView;
    private ShowListAdapter showListAdapter;
    private Bundle extras;
    private TextView venueName;
    private TextView venueLocation;
    private TextView showDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        listView = (ListView) findViewById(R.id.list);
        extras = getIntent().getExtras();

        //showListAdapter = new ShowListAdapter(getApplicationContext(), );
    }

    public void getShow(String showInfo) {
        if (showInfo.equals("showInfo")) {

        }
    }
}
