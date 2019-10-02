package application.launcher.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Disease  implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;

	private String nom;
	
	private Specialty specialty;

	public Disease(int id, String nom, Specialty specialty) {
		super();
		this.id = id;
		this.nom = nom;
		this.specialty = specialty;
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
	public Specialty getSpecialty() {
		return specialty;
	}
	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
	

}
