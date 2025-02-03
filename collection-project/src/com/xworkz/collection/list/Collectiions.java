package com.xworkz.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collectiions {
    public static void main(String[] args) {
        System.out.println("---- sort in ArrayList using Collections utility class ----");
        List<String> collection = new ArrayList();
        collection.add("Babi");
        collection.add("Baba");
        collection.add("Babu");
        collection.add("Kaba");
        //utility class to sort List
        Collections.sort(collection); //sort is a static method objection creation not  required
        //read all objects
        for (Object o : collection)
            System.out.println(o);

        System.out.println("---- sort in LinkedList using Collections utility class ----");
        List<Integer> c = new LinkedList<>();
        c.add(34);
        c.add(3);
        c.add(789);
        c.add(1);
        //utility class to sort List
        Collections.sort(c);
        for (Object o : c)
            System.out.println(o);


    }
}
