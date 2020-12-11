package com.amira.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.amira.entities.Etudiant;

public interface EtudiantService {
	Etudiant saveEtudiant(Etudiant etudiant);
	Etudiant updateEtudiant(Etudiant e);
	void deleteEtudiant(Etudiant e);
	 void deleteEtudiantById(Long id);
	 Etudiant getEtudiant(Long id);
	List<Etudiant> getAllEtudiants();
	Page<Etudiant> getAllEtudiantsParPage(int page, int size);
	
}
