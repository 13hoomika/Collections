package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Trainee;

import java.util.Comparator;

public class TraineeNameComparator implements Comparator<Trainee> {
    @Override
    public int compare(Trainee o1, Trainee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
