package com.dio.bootcampchallengepoo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Mentorship extends Subject {

    private LocalDate date;

    public Mentorship(String subject, String description, LocalDate date) {
        super(subject, description);
        this.date = date;
    }

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria: {" +
                "\nTítulo: " + this.getTitle() +
                "\nDescrição: " + this.getDescription() +
                "\nData: " + date.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")) +
                "\n}";
    }
}
