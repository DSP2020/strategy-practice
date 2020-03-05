package mx.iteso.mariokart;

public abstract class Item {
	private int duration;
	
	public abstract void itemEffect(MarioKartCharacter character);
	
	public int getDuration() {
		return this.duration;
	}
	
	public void setDuration(int time) {
		this.duration = time;
	}
	
}
