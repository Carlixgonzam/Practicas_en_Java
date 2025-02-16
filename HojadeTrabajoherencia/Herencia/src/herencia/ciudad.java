package herencia;

public class ciudad implements GraphicElement{
	
	public String nombre;
	
	public ciudad(String nombre) {
		this.nombre= nombre;
	}
	
	public void addTile(Tile tile) {
	}
	
	public void addConnector(Connector connector) {
		
	}
	
	public static void main(String[] args) {
		
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
