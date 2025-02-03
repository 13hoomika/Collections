package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.GoogleCalendar;

import java.util.Comparator;

public class CalendarEventDateComparator implements Comparator<GoogleCalendar> {
    @Override
    public int compare(GoogleCalendar o1, GoogleCalendar o2) {
        return o2.getEventDate().compareTo(o2.getEventDate());
    }
}
