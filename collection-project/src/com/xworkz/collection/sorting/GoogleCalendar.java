package com.xworkz.collection.sorting;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class GoogleCalendar implements Comparable<GoogleCalendar>{
    private int calenderId;
    private String who;
    private String description;
    private boolean isAllDayEvent;


    @Override
    public int compareTo(GoogleCalendar o) {
        return this.getCalenderId()- o.getCalenderId();
    }
}
