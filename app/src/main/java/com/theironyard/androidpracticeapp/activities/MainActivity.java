package com.theironyard.androidpracticeapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.theironyard.androidpracticeapp.R;
import com.theironyard.androidpracticeapp.adapters.YearListAdapter;
import com.theironyard.androidpracticeapp.entities.Year;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private YearListAdapter yearListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Year[] years = new Year[] {
                new Year (2009),
                new Year (2010),
                new Year (2011),
                new Year (2012),
                new Year (2013),
                new Year (2014),
                new Year (2015),
                new Year (2016)
        };

        listView = (ListView) findViewById(R.id.list);

        yearListAdapter = new YearListAdapter(getApplicationContext(), years);
        listView.setAdapter(yearListAdapter);

    }
}
