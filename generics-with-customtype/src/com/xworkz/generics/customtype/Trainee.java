package com.xworkz.generics.customtype;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Trainee implements Comparable<Trainee>{
    private int id;
    private String name;
    private String email;
    private long phoneNumber;
    private boolean isPlaced;

    @Override
    public int compareTo(Trainee o) {
        return this.getId() - o.getId();
    }
}
