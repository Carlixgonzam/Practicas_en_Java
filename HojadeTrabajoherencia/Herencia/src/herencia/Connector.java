package herencia;

import java.awt.Graphics;

public abstract class Connector implements Clickable, GraphicElement {
	public int getX;
	public int getY;
	public int getWidth;
	public int getHeight;
	public void paint(Graphics g) {
	}
	public boolean isSelected;
	public boolean isLocked;
	
	public static void setSelected(boolean Boolean) {
	}
	public static void setLocked(boolean Boolean) {
		
	}
	public void addPart(ConnectingPart part) {
		
	}
	

}
