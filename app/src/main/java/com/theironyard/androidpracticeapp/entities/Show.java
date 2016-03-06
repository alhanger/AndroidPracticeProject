package com.theironyard.androidpracticeapp.entities;

/**
 * Created by alhanger on 3/5/16.
 */
public class Show {

    private String venue;
    private String date;

    public Show(String venue, String date) {
        this.venue = venue;
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
