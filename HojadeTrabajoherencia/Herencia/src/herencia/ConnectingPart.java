package herencia;

import java.awt.Graphics;

public abstract class ConnectingPart extends Connector{
	private int x1;
	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	private int y1;
	private int x2;
	private int y2;
	
	
	public ConnectingPart(int x1, int x2, int y1, int y2) {
	}
	
	public void paint(Graphics g) {
		
	}
	

}
