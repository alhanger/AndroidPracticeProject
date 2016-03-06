package com.theironyard.androidpracticeapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.theironyard.androidpracticeapp.R;
import com.theironyard.androidpracticeapp.adapters.YearListAdapter;
import com.theironyard.androidpracticeapp.entities.Show;
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

        final Show miami = new Show("American Airlines Arena", "12/31/2009");
        final Show charleston = new Show("North Charleston Coliseum", "10/16/2010");
        final Show atlanta = new Show("Verizon Wireless Amphitheatre", "6/14/2011");
        final Show colorado = new Show("Dick's Sporting Goods Park", "8/31/2012");
        final Show hampton = new Show("Hampton Coliseum", "10/18/2013");
        final Show orangeBeach = new Show("The Wharf", "8/1/2014");
        final Show magnaball = new Show("Watkins Glen International", "8/23/2015");
        final Show mexico = new Show("Riveria Maya", "1/15/2016");

        listView = (ListView) findViewById(R.id.list);

        yearListAdapter = new YearListAdapter(getApplicationContext(), years);
        listView.setAdapter(yearListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
