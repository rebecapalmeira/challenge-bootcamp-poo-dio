package com.dio.bootcampchallengepoo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course extends Subject {

    private int workload;

    @Override
    public double calculateXp() {
        return DEFAULT_XP * workload;
    }

    @Override
    public String toString() {
        return "Curso: {" +
                "\nTítulo: " + this.getTitle() +
                "\nDescrição: " + this.getDescription() +
                "\nCarga Horária: " + workload +
                "\n}";
    }
}
