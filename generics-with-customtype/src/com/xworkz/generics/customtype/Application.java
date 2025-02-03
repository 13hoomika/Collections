package com.xworkz.generics.customtype;

import lombok.*;

import java.util.Comparator;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Application implements Comparable<Application> {
    private int id;
    private String appName;
    private double version;
    private String developer;


    @Override
    public int compareTo(Application o) {
        return this.id - o.id;
    }

}
