package com.xworkz.generics.runner;

import com.xworkz.generics.comparator.CalendarDescriptionComparator;
import com.xworkz.generics.comparator.CalendarEventDateComparator;
import com.xworkz.generics.customtype.GoogleCalendar;

import java.util.Collections;
import java.util.LinkedList;

public class GoogleCalendarRunner {
    public static void main(String[] args) {
        LinkedList<GoogleCalendar> linkedList = new LinkedList<>();
        linkedList.add(new GoogleCalendar(3, "05-01-2025", "Keerthi's Birthday",true));
        linkedList.add(new GoogleCalendar(1,"24-01-2025","NY Celebration",true));
        linkedList.add(new GoogleCalendar(2,"01-01-2025","International Workers' Day ",false));

        System.out.println("--------------- Default sort by Calendar Id ---------------");
        Collections.sort(linkedList);
        for (Object id : linkedList) {
            System.out.println(id);
        }

        System.out.println("--------------- sort by EventDate ---------------");
        Collections.sort(linkedList,new CalendarEventDateComparator());
        for (GoogleCalendar eventDate : linkedList) {
            System.out.println(eventDate);
        }
        System.out.println("--------------- sort by Description ---------------");
        Collections.sort(linkedList,new CalendarDescriptionComparator());
        for (GoogleCalendar des : linkedList) {
            System.out.println(des);
        }

    }
}
