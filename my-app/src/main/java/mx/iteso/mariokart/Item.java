package mx.iteso.mariokart;

public abstract class Item {
	private int tiempo;
	
	public abstract void activeItem(MarioKartCharacter c);
	
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
		
}
