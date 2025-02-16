package herencia;

import java.awt.Graphics;

public class House extends Building{
	private int floors;
	
	public House(int x, int y, int floors) {
		super(x, y, floors, floors);
		
	}
	public void paint(Graphics g) {
		
	}
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}

}
