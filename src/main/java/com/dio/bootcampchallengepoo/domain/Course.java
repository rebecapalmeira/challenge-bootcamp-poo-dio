package com.dio.bootcampchallengepoo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {

    private String title;
    private String description;
    private int workload;

    @Override
    public String toString() {
        return "Curso: {" +
                "\nTítulo: " + title +
                "\nDescrição: " + description +
                "\nCarga Horária: " + workload +
                "\n}";
    }
}
