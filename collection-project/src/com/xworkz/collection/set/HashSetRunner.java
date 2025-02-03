package com.xworkz.collection.set;

import java.util.*;

public class HashSetRunner {
    public static void main(String[] args) {
        System.out.println("============= Map HashMap =============");
        Map c = new HashMap();
        c.put(1,23); // both arguments are Obj type
        c.put(2,78); // each K & V pair is known as Entry (Interface)
        c.put(3,789);
        c.put(3,89);// duplicate key not allowed it checks the previous key is present removes & add new key val
        System.out.println("HashMap: "+c);

        Object v = c.get(2);
        System.out.println("index[2]: " + v);

        System.out.println("\n============= Set HashSet =============");
        Set collection = new HashSet();
        collection.add(23);
        collection.add(78);
        collection.add(789);
        collection.add(8);
//        collection.add(789);
//        collection.add(789);

         System.out.println("HasSet: "+collection); // not good practice

        // to retrieve / fetch / traversing / iterating
        System.out.println("-- option1 : using for each loop --");
        for(Object obj: collection){
            System.out.println(obj);
        }
        System.out.println("-- option2 : using iterator --");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){ // hasNext() - check whether next available or not
            Object o = iterator.next(); // to get object
            System.out.println(o);
        }

        System.out.println("\n============= get odd numbers =============");
        for(Object object : collection){
            Integer value = (Integer) object;
            if(value % 2 == 1)
                System.out.println(value + " is odd");
        }

        System.out.println("\n============= get even numbers =============");
        for(Object object : collection){
            Integer value = (Integer) object;
            if(value % 2 == 0)
                System.out.println(value + " is even");
        }

        System.out.println("\n============= get odd then even num with iterator =============");
        Iterator iterator1 = collection.iterator();
        while (iterator1.hasNext()){
            Object o = iterator1.next();
            Integer value = (Integer) o;
            if(value % 2 == 1)
                System.out.println(value + " is odd");
            else System.out.println(value + " is even");
        }

    }
}
