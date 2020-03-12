package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;

public abstract class MarioKartCharacter {
	
	private Acceleration al;
	private Drift drift;
	
	public Acceleration getAcelerate() {
		return al;
	}

	public void setAcelerate(Acceleration ab) {
		this.al = ab;
	}
	
	public void takeEffect(Item a) {
	a.activeItem(this);
	}
	
	public Drift getDrift() {
		return drift;
	}
	
	public void setDrift(Drift d) {
		this.drift = d;
	}
}