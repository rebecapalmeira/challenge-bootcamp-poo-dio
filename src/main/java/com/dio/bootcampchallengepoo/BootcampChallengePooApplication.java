package com.dio.bootcampchallengepoo;

import com.dio.bootcampchallengepoo.domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class BootcampChallengePooApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampChallengePooApplication.class, args);

		Course coursePOOJava = new Course();
		coursePOOJava.setTitle("Java");
		coursePOOJava.setDescription("Curso de Programação Orientada a Objetos em Java");
		coursePOOJava.setWorkload(8);

		Course courseIntroLogicJava = new Course();
		courseIntroLogicJava.setTitle("Javascript");
		courseIntroLogicJava.setDescription("Introdução à Lógica de Programação em Java");
		courseIntroLogicJava.setWorkload(4);

		Mentorship mentorshipJavaWeb = new Mentorship("Mentoria de Java Web", "Criando uma Aplicação RESTful", LocalDate.now());


		Bootcamp bootcampJavaGFT= new Bootcamp();
		bootcampJavaGFT.setName("Bootcamp Java Developer GFT Estágio");
		bootcampJavaGFT.setDescription("Bootcamp Java Dev - seleção para programa de estágio GFT");
		bootcampJavaGFT.getSubjects().add(coursePOOJava);
		bootcampJavaGFT.getSubjects().add(courseIntroLogicJava);
		bootcampJavaGFT.getSubjects().add(mentorshipJavaWeb);

		Dev devRebeca = new Dev();
		devRebeca.setName("Rebeca Palmeira");
		devRebeca.subscribeToBootcamp(bootcampJavaGFT);
		System.out.println(devRebeca.getName() + " inscrito(a) nos conteúdos: " + devRebeca.getSubscribedSubjects());
		devRebeca.progress();
		devRebeca.progress();
		devRebeca.progress();
		System.out.println(devRebeca.getName() + " inscrito(a) nos conteúdos: " + devRebeca.getSubscribedSubjects());
		System.out.println(devRebeca.getName() + " concluiu os conteúdos: " + devRebeca.getFinishedSubjects());
		System.out.println(devRebeca.getName() + " XP: " + devRebeca.calculateTotalXp());

		Dev devSara = new Dev();
		devSara.setName("Sara Almeida");
		devSara.subscribeToBootcamp(bootcampJavaGFT);
		System.out.println(devSara.getName() + " inscrito(a) nos conteúdos: " + devSara.getSubscribedSubjects());
		devSara.progress();
		System.out.println(devSara.getName() + " inscrito(a) nos conteúdos: " + devRebeca.getSubscribedSubjects());
		System.out.println(devSara.getName() + " concluiu os conteúdos: " + devRebeca.getFinishedSubjects());
		System.out.println(devSara.getName() + " XP: " + devSara.calculateTotalXp());

	}

}
