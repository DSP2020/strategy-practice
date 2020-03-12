package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;

public abstract class MarioKartCharacter {
	private Acceleration acc;
	private Drift dr;
	
	public Acceleration getAcceleration() {
        return this.acc;
    }
	
    public void setAcceleration(Acceleration a) {
        this.acc = a;
    }
    
    public Drift getDrift() {
    	return this.dr;
    }
    
    public void setDrift(Drift d) {
    	this.dr = d;
    }
    
    public void activeItem(Item item) {
    	item.itemEffect(this);
    }
    
}
