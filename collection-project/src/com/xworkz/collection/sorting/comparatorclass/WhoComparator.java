package com.xworkz.collection.sorting.comparatorclass;

import com.xworkz.collection.sorting.GoogleCalendar;

import java.util.Comparator;

public class WhoComparator implements Comparator<GoogleCalendar> {

    @Override
    public int compare(GoogleCalendar o1, GoogleCalendar o2) {
        return o1.getWho().compareTo(o2.getWho());
    }
}
