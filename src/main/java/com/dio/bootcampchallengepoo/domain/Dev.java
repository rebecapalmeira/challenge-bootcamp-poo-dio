package com.dio.bootcampchallengepoo.domain;

import lombok.*;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.DoubleStream;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Dev {

    private String name;
    private Set<Subject> subscribedSubjects = new LinkedHashSet<>();
    private Set<Subject> finishedSubjects = new LinkedHashSet<>();

    public void subscribeToBootcamp(Bootcamp bootcamp) {
        this.subscribedSubjects.addAll(bootcamp.getSubjects());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress() {
        Optional<Subject> subject = this.subscribedSubjects.stream().findFirst();
        if(subject.isPresent()) {
            this.finishedSubjects.add(subject.get());
            this.subscribedSubjects.remove(subject.get());
        } else {
            System.out.println("Você não está matriculado em nenhum conteúdo.");
        }
    }

    public double calculateTotalXp() {
        return this.finishedSubjects
                .stream()
                .mapToDouble(Subject::calculateXp)
                .sum();
    }

}
