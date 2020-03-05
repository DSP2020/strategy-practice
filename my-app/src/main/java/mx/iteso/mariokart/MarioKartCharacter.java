package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;

public abstract class MarioKartCharacter {
	
	private Acceleration al;
	
	public Acceleration getAcelerate() {
		return al;
	}

	public void setAcelerate(Acceleration ab) {
		this.al = ab;
	}
	
	public void takeEffect(Item a) {
	a.activeItem(this);
	}
	
}
