package com.xworkz.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListRunner {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> ArrayList methods >>>>>>>>>>>>>>>>>>>>>>>>");
        //abstraction
        List collection1 = new ArrayList(); // ~ Vector() // set-HashSet -> removes duplicate val
        collection1.add(1);
        collection1.add(2);
        collection1.add(3);
        collection1.add(4);
        collection1.add(5);
        collection1.add(6);
        collection1.add(123);
        collection1.add(26);
        collection1.add(5657);
        collection1.add(10);
        // ArrayList allows duplicates and null values
        collection1.add(10);
        collection1.add(10);
        collection1.add(null);
        collection1.add(null);
        System.out.println("collection1: " + collection1);

        List collection2 = new ArrayList();
        collection2.add(123);
        collection2.add(26);
        collection2.add(5657);
        collection2.add(88);
        System.out.println("collection2: " + collection2);

        System.out.println("\n======================= retain(collection) in ArrayList =======================");
        collection1.retainAll(collection2);
        System.out.println("Retain only the elements in collection1 that are in collection2: "+collection1);

        System.out.println("\n======================= forEach(action) in ArrayList =======================");
//        iterate through collection1 and print elements
        collection1.forEach(System.out::println); // print obj one by one => Good Practice

        System.out.println("\n======================= add(index,ele) & add(collection) in ArrayList =======================");
        collection2.add(2,73);
        System.out.println("Added 73 at index 2 to collection2: "+collection2);

        collection2.addAll(collection1);
        System.out.println("Added all objects from the collection1 to collection2 : "+collection2);

        System.out.println("\n======================= get(object) in ArrayList =======================");
        Object obj = collection1.get(2);
        int value = (Integer) obj; //DownCasting to Integer
        System.out.println("Get the object at index[2] in the collection1: " + value);

        Object object = collection2.get(2);
        int val = (Integer)object;
        System.out.println("Get the object at index[2] in the collection2: " + val);

        System.out.println("\n======================= contains(Object) & contains(collection) in ArrayList =======================");
        boolean contains = collection2.contains(10);
        System.out.println("collection2 contains 10: "+contains);

        boolean containsAll = collection2.containsAll(collection1);
        System.out.println("collection2 contains all collection1 objects: "+containsAll);

        System.out.println("\n======================= int indexOf(Object o) =======================");
        // Using indexOf() to find the index of 88
        int v = collection2.indexOf(88);
        System.out.println("Index of 88 in collection2: " + v); // Prints the index of the element

        System.out.println("\n======================= remove(object) & removeAll(collection) in ArrayList =======================");
        System.out.println("collection2: "+collection2);
        collection2.remove(4);
        System.out.println("removed val in index[4]: "+collection2);

//        collection.removeAll(collection);
//        System.out.println("removed all collection2: "+collection);

        System.out.println("\n======================= clear() in ArrayList =======================");
        System.out.println("collection2: "+collection2);
        collection2.clear();
        System.out.println("cleared collection2: "+collection2);

        System.out.println("\n======================= isEmpty() in ArrayList =======================");
        boolean empty = collection1.isEmpty();
        System.out.println("is collection1 empty: " + empty);

        boolean e = collection2.isEmpty();
        System.out.println("is Collection2 empty: " + e);

        System.out.println("\n======================= size() in ArrayList =======================");
        int size = collection1.size();
        System.out.println("size of collection1 is: " + size);
        int s = collection2.size();
        System.out.println("size of collection2 is: " + s);
    }
}
