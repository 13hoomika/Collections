package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Trainee;

import java.util.Comparator;

public class TraineeEmailComparator implements Comparator<Trainee> {
    @Override
    public int compare(Trainee o1, Trainee o2) {
        return o2.getEmail().compareTo(o2.getEmail());
    }
}
