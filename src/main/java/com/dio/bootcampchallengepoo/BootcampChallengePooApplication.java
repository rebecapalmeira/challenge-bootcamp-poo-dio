package com.dio.bootcampchallengepoo;

import com.dio.bootcampchallengepoo.domain.Course;
import com.dio.bootcampchallengepoo.domain.Mentorship;
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

		System.out.println(course1);
		System.out.println(course2);
		System.out.println(mentorship1);

	}

}
