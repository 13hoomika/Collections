package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.GoogleCalendar;

import java.util.Comparator;

public class CalendarDescriptionComparator implements Comparator<GoogleCalendar> {
    @Override
    public int compare(GoogleCalendar o1, GoogleCalendar o2) {
        return o1.getDescription().compareTo(o2.getDescription());
    }
}
