package com.xworkz.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListIteratorRunner {
    public static void main(String[] args) {
        //generics <> in collection framework to store homogeneous type of data, used only when u know waht type of data ur r going to add
        // angular bracket <> can have only Primitive/wrapper data type
        List<Integer> collection = new LinkedList<>();

        collection.add(23);
        collection.add(78);
        collection.add(33);

        System.out.println("fetch all data");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){ // hasNext() - check whether next available or not
            Object o = iterator.next(); // to get object
            System.out.println(o);
        }
//        System.out.println("fetch previous data");
//        ListIterator listIterator = collection.listIterator();
//        listIterator.next();// pointer is b/w 23 & 78 return 23
//        listIterator.next(); // pointer is b/w 78 & 33 return 78
//        Object val = listIterator.previous();
//        System.out.println(val);

        System.out.println("fetch from last");
        ListIterator listIterator = collection.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        while (listIterator.hasNext()){
            Object val = listIterator.previous();
            System.out.println(val);
        }

        // CopyOnWriteArrayList ignore modification on collection (add/remove) by avoiding ConCurrentModificationException
        System.out.println("CopyOnWriteArrayList");
        List collection1 = new CopyOnWriteArrayList();
        collection1.add(23);
        collection1.add(78);
        collection1.add(33);

        for(Object obj: collection1){
            Object val = (Integer) obj;
            collection1.add(90);
            System.out.println(val);
        }



    }
}
