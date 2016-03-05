package com.theironyard.androidpracticeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
