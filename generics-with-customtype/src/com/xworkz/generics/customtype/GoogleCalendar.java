package com.xworkz.generics.customtype;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class GoogleCalendar implements Comparable<GoogleCalendar>{
    private int calenderId;
    private String eventDate;
    private String description;
    private boolean isAllDayEvent;

    @Override
    public int compareTo(GoogleCalendar o) {
        return this.calenderId - o.calenderId;
    }
}
