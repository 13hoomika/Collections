package com.xworkz.collection.sorting;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class SortingInJava8Runner {
    public static void main(String[] args) {
        LinkedList<GoogleCalendar> collection = new LinkedList<>();
        collection.add(new GoogleCalendar(3, "Bhoomika", "Keerthi's Birthday",true));
        collection.add(new GoogleCalendar(1,"Poojitha","NY Celebration",true));
        collection.add(new GoogleCalendar(2,"Keerthi","International Workers' Day ",false));

        System.out.println("------------ Java 8 sorting method:1 ------------");
        System.out.println(collection.
                stream().
                sorted((o1, o2) -> o1.getWho().compareTo(o2.getDescription())).
                collect(Collectors.toList()));

        System.out.println("------------ Java 8 sorting method:2 ------------");
        System.out.println(collection.stream()
                .sorted(Comparator.comparing(GoogleCalendar::getDescription))
                        .collect(Collectors.toList())
        );



    }
}
