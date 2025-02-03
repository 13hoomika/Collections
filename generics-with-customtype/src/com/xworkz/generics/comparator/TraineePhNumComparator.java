package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Trainee;

import java.util.Comparator;

public class TraineePhNumComparator implements Comparator<Trainee> {
    @Override
    public int compare(Trainee o1, Trainee o2) {
        return Long.compare(o1.getPhoneNumber(), o2.getPhoneNumber());
    }
}
