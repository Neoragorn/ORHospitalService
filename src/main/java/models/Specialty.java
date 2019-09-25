package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Specialty  implements Serializable {
	private String nom;

	@Id
	@GeneratedValue
	private int id;

	
	public Specialty(String nom) {
		super();
		this.nom = nom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
}
