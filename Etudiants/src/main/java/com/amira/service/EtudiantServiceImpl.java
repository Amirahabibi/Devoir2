package com.amira.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.amira.entities.Etudiant;
import com.amira.repos.EtudiantRepository;
@Service
public class EtudiantServiceImpl implements EtudiantService{
@Autowired
	EtudiantRepository etudiantRepository;

@Override
public Etudiant saveEtudiant(Etudiant etudiant) {

	return etudiantRepository.save(etudiant);
}

@Override
public Etudiant updateEtudiant(Etudiant e) {
	return etudiantRepository.save(e);
}

@Override
public void deleteEtudiant(Etudiant e) {
	etudiantRepository.delete(e);
}

@Override
public void deleteEtudiantById(Long id) {
	etudiantRepository.deleteById(id);
	
}

@Override
public Etudiant getEtudiant(Long id) {
	return etudiantRepository.findById(id).get();
}

@Override
public List<Etudiant> getAllEtudiants() {
	return etudiantRepository.findAll();
}

@Override
public Page<Etudiant> getAllEtudiantsParPage(int page, int size) {
	return etudiantRepository.findAll(PageRequest.of(page, size));
}
	

}
