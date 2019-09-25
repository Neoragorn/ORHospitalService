package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Planning  implements Serializable {

	@Id
	@GeneratedValue
	private int id;

	public Planning(int id) {
		super();
		this.id = id;
	}
	
	
}
