package com.xworkz.collection.sorting;

import com.xworkz.collection.sorting.comparatorclass.DescriptionComparator;
import com.xworkz.collection.sorting.comparatorclass.WhoComparator;

import java.util.Collections;
import java.util.LinkedList;

public class GoogleCalendarRunner {
    public static void main(String[] args) {
        LinkedList<GoogleCalendar> linkedList = new LinkedList<>();
        linkedList.add(new GoogleCalendar(3, "Bhoomika", "Keerthi's Birthday",true));
        linkedList.add(new GoogleCalendar(1,"Poojitha","NY Celebration",true));
        linkedList.add(new GoogleCalendar(2,"Keerthi","International Workers' Day ",false));

        System.out.println("--------------- Sort based on Event ID by default using Comparable Interface ---------------");
        Collections.sort(linkedList);
        for (Object obj : linkedList) {
            System.out.println(obj);
        }

        System.out.println("--------------- Sort based on who using Comparator Interface ---------------");
        Collections.sort(linkedList,new WhoComparator());
        for(GoogleCalendar who:linkedList){
            System.out.println(who);
        } 

        System.out.println("--------------- Sort based on Description using Comparator Interface ---------------");
        Collections.sort(linkedList,new DescriptionComparator());
        for(GoogleCalendar description:linkedList){
            System.out.println(description);
        }



    }
}
