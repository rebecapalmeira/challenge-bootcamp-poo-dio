package com.dio.bootcampchallengepoo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mentorship {

    private String title;
    private String description;
    private LocalDate date;

    @Override
    public String toString() {
        return "Mentoria: {" +
                "\nTítulo: " + title +
                "\nDescrição: " + description +
                "\nData: " + date.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")) +
                "\n}";
    }
}
