package com.xworkz.collection.sorting.comparatorclass;

import com.xworkz.collection.sorting.GoogleCalendar;
import java.util.Comparator;

public class DescriptionComparator implements Comparator<GoogleCalendar> {
    @Override
    public int compare(GoogleCalendar o1, GoogleCalendar o2) {
        return o1.getDescription().compareTo(o2.getDescription());
    }
}
