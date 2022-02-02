package com.dio.bootcampchallengepoo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Subject {

    protected static final double DEFAULT_XP = 10d;

    private String title;
    private String description;

    public abstract double calculateXp();

}
