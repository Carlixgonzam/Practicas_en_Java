package herencia;

import java.awt.Graphics;

public class Mansion extends Building{

	private int rooms;
	
	public Mansion(int x, int y, int rooms) {
		super(x,y, rooms, rooms);
		
	}
	public void paint(Graphics g) {
		
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

}
