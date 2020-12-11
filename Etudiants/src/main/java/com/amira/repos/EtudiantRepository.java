package com.amira.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amira.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
