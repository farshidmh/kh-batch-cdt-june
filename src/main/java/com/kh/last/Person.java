package com.kh.last;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Person {

    private String name;
    private String family;
    private int birthYear;


    public int getAge() {
        return 2021 - birthYear;
    }

}
