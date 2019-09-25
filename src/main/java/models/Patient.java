package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient  implements Serializable {

	@Id
	@GeneratedValue
	private int id;

	private String nom;
	
	private Disease disease;
	
	public Patient(int id, String nom, Disease disease) {
		super();
		this.id = id;
		this.nom = nom;
		this.disease = disease;
	}

	public Patient() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}
	
}
