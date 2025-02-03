package com.xworkz.collection.customclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    public class Ludo {
        private int playerId;
        private String name;
        private float wins;
}
