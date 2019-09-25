package models;

import java.util.ArrayList;
import java.util.List;

public class OR {

	List<Room> rooms = new ArrayList<Room>();

	public OR(List<Room> rooms) {
		super();
		this.rooms = rooms;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	

}
