package com.theironyard.androidpracticeapp.entities;

import com.theironyard.androidpracticeapp.entities.Show;

import java.util.ArrayList;

/**
 * Created by alhanger on 3/5/16.
 */
public class Year {

    private int year;
    private ArrayList<Show> shows;

    public Year() {

    }

    public Year(int year) {
        shows = new ArrayList<>();
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Show> getShows() {
        return shows;
    }

    public void setShows(ArrayList<Show> shows) {
        this.shows = shows;
    }

    public void addShow(Show show) {
        shows.add(show);
    }
}
