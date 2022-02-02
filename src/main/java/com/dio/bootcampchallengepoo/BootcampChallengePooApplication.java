package com.dio.bootcampchallengepoo;

import com.dio.bootcampchallengepoo.domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class BootcampChallengePooApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampChallengePooApplication.class, args);

		Course course1 = new Course();
		course1.setTitle("Java");
		course1.setDescription("Curso de Programação Orientada a Objetos em Java");
		course1.setWorkload(8);

		Course course2 = new Course();
		course2.setTitle("Javascript");
		course2.setDescription("Introdução à Lógica de Programação em Javascript");
		course2.setWorkload(4);

		Mentorship mentorship1 = new Mentorship("Mentoria de Java Web", "Criando uma Aplicação RESTful", LocalDate.now());

//		System.out.println(course1);
//		System.out.println(course2);
//		System.out.println(mentorship1);

		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setName("Bootcamp Java Developer");
		bootcamp1.setDescription("Descrição Bootcamp Java Developer");
		bootcamp1.getSubjects().add(course1);
		bootcamp1.getSubjects().add(course2);
		bootcamp1.getSubjects().add(mentorship1);

		Dev devRebeca = new Dev();
		devRebeca.setName("Rebeca Palmeira");
		devRebeca.subscribeToBootcamp(bootcamp1);

		Dev devSara = new Dev();
		devSara.setName("Sara Almeida");
		devSara.subscribeToBootcamp(bootcamp1);

	}

}
