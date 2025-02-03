package com.xworkz.generics.runner;

import com.xworkz.generics.comparator.TraineeEmailComparator;
import com.xworkz.generics.comparator.TraineeNameComparator;
import com.xworkz.generics.comparator.TraineePhNumComparator;
import com.xworkz.generics.customtype.Trainee;

import java.util.Collections;
import java.util.LinkedList;

public class TraineeRunner {
    public static void main(String[] args) {
        LinkedList<Trainee> arrayList = new LinkedList<>();
        arrayList.add(new Trainee(1,"Bhoomika","bhoomikacp@gmail.com",1234567890L,true));
        arrayList.add(new Trainee(2,"Anu","anu@gmail.com",9566778899L,true));
        arrayList.add(new Trainee(3,"Bhanu","bhanutripati@gmail.com",874248987L,false));

        System.out.println("------------- Sort by Trainee id by default sort method -------------");
        Collections.sort(arrayList);
        for(Object id: arrayList)
            System.out.println(id);

        System.out.println("\n------------- Sort by Trainee name by Comparator class -------------");
        Collections.sort(arrayList, new TraineeNameComparator());
        for(Object name: arrayList)
            System.out.println(name);

        System.out.println("\n------------- Sort by Trainee email by Comparator class -------------");
        Collections.sort(arrayList, new TraineeEmailComparator());
        for(Object email: arrayList)
            System.out.println(email);

        System.out.println("\n------------- Sort by Trainee phNumber by Comparator class -------------");
        Collections.sort(arrayList, new TraineePhNumComparator());
        for(Object ph: arrayList)
            System.out.println(ph);

    }
}
