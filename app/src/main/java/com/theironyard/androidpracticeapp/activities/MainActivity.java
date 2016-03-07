package com.theironyard.androidpracticeapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.theironyard.androidpracticeapp.R;
import com.theironyard.androidpracticeapp.adapters.YearListAdapter;
import com.theironyard.androidpracticeapp.entities.Show;
import com.theironyard.androidpracticeapp.entities.Year;

public class MainActivity extends Activity {

    private ListView listView;
    private YearListAdapter yearListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Year nine = new Year(2009);
        Year ten = new Year(2010);
        Year eleven = new Year(2011);
        Year twelve = new Year(2012);
        Year thirteen = new Year(2013);
        Year fourteen = new Year(2014);
        Year fifteen = new Year(2015);
        Year sixteen = new Year(2016);

        final Year[] years = new Year[] {nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen};

        final Show miami = new Show("American Airlines Arena", "12/31/2009");
        nine.addShow(miami);

        final Show charleston = new Show("North Charleston Coliseum", "10/16/2010");
        ten.addShow(charleston);

        final Show atlanta = new Show("Verizon Wireless Amphitheatre", "6/14/2011");
        eleven.addShow(atlanta);

        final Show colorado = new Show("Dick's Sporting Goods Park", "8/31/2012");
        twelve.addShow(colorado);

        final Show hampton = new Show("Hampton Coliseum", "10/18/2013");
        thirteen.addShow(hampton);

        final Show orangeBeach = new Show("The Wharf", "8/1/2014");
        fourteen.addShow(orangeBeach);

        final Show magnaball = new Show("Watkins Glen International", "8/23/2015");
        fifteen.addShow(magnaball);

        final Show mexico = new Show("Riveria Maya", "1/15/2016");
        sixteen.addShow(mexico);


        listView = (ListView) findViewById(R.id.list);

        yearListAdapter = new YearListAdapter(getApplicationContext(), years);
        listView.setAdapter(yearListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showIntent = new Intent(MainActivity.this, ShowActivity.class);
                showIntent.putExtra("showInfo", years[position].getShows());
                startActivity(showIntent);
            }
        });
    }
}
