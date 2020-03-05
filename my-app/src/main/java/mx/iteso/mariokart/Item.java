package mx.iteso.mariokart;

public abstract class Item {
	private String name;
	private int tiempo;
	
	public abstract void activeItem(MarioKartCharacter c);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
		
}
