package herencia;
import java.awt.Graphics;

public class Calle extends ConnectingPart{
	
	public Calle(int x1, int x2, int y1, int y2) {
		super(x1, x2, y1, y2);
	}
	public void paint(Graphics g) {
		
	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLocked() {
		// TODO Auto-generated method stub
		return false;
	}

}
