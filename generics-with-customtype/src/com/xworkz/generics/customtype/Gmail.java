package com.xworkz.generics.customtype;

import lombok.*;

import java.util.Comparator;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Gmail implements Comparable<Gmail> {
    private int id;
    private String toAddress;
    private String fromAddress;
    private String body;


    @Override
    public int compareTo(Gmail o) {
        return this.getId() - o.getId();
    }
}
