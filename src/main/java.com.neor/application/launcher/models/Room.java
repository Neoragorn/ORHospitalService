package application.launcher.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Room  implements Serializable {

	@Id
	@GeneratedValue
	private int id;

	private Specialty specialty;
	
	@OneToMany
	private List<Nurse> nurses;
	
	private Surgeon surgeon;
	private Planning planning;
	
	public Room() {
		super();
	}
	
	public Room(int id, Specialty specialty, List<Nurse> nurses, Surgeon surgeon, Planning planning) {
		super();
		this.id = id;
		this.specialty = specialty;
		this.nurses = nurses;
		this.surgeon = surgeon;
		this.planning = planning;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Specialty getSpecialty() {
		return specialty;
	}
	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
	public List<Nurse> getNurses() {
		return nurses;
	}
	public void setNurses(List<Nurse> nurses) {
		this.nurses = nurses;
	}
	public Surgeon getSurgeon() {
		return surgeon;
	}
	public void setSurgeon(Surgeon surgeon) {
		this.surgeon = surgeon;
	}

	public Planning getPlanning() {
		return planning;
	}

	public void setPlanning(Planning planning) {
		this.planning = planning;
	}
	
}
