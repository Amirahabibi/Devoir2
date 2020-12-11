package com.amira.entities;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Etudiant {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEtudiant;
	private String nomEtudiant;
	private String prenomEtudiant;
	private String cinEtudiant;
	private Date dateInscrit;
	
	public Etudiant() {
		super();
		
	}
	
	public Etudiant(String nomEtudiant, String prenomEtudiant, String cinEtudiant, Date dateInscrit) {
		super();
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		this.cinEtudiant = cinEtudiant;
		this.dateInscrit = dateInscrit;
	}

	public Long getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNomEtudiant() {
		return nomEtudiant;
	}
	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}
	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}
	public String getCinEtudiant() {
		return cinEtudiant;
	}
	public void setCinEtudiant(String cinEtudiant) {
		this.cinEtudiant = cinEtudiant;
	}
	public Date getDateInscrit() {
		return dateInscrit;
	}
	public void setDateInscrit(Date dateInscrit) {
		this.dateInscrit = dateInscrit;
	}

	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nomEtudiant=" + nomEtudiant + ", prenomEtudiant="
				+ prenomEtudiant + ", cinEtudiant=" + cinEtudiant + ", dateInscrit=" + dateInscrit + "]";
	}
	


	
}
