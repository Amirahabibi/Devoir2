package com.amira.etudiants;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amira.entities.Etudiant;
import com.amira.service.EtudiantService;

@SpringBootApplication
public class EtudiantApplication implements CommandLineRunner {
	@Autowired
EtudiantService etudiantService;
	public static void main(String[] args) {
		SpringApplication.run(EtudiantApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		etudiantService.saveEtudiant(new Etudiant("Amira","habibi","09522980",new Date()));
		etudiantService.saveEtudiant(new Etudiant("abyr","soltani","08564565",new Date()));
		etudiantService.saveEtudiant(new Etudiant("nourhene","lachiheb","09522458",new Date()));
		etudiantService.saveEtudiant(new Etudiant("nour","lachiheb","09722458",new Date()));
		etudiantService.saveEtudiant(new Etudiant("nouha","lachiheb","07522458",new Date()));
	}

}
