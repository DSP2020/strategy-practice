package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;

public abstract class MarioKartCharacter {
	private Acceleration acc;
	
	public Acceleration getAcceleration() {
        return this.acc;
    }
	
    public void setAcceleration(Acceleration a) {
        this.acc = a;
    }
    
    public void activeItem(Item item) {
    	item.itemEffect(this);
    }
    
}
