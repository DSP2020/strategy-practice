package mx.iteso.mariokart;

import mx.iteso.mariokart.behavior.*;

public abstract class Character{
	
	private Acceleration acceleration; 
	private Drift driftt;
	
    public void setAcceleration(Acceleration a) {
        this.acceleration = a;
    }

    public Acceleration getAcceleration() {
        return this.acceleration;
    }
	
	public void useItem(Item item) {
		item.changes(this);
	}
	
	public abstract String accelerate();

	public Drift getDrift() {
		return driftt;
	}

	public void setDrift(Drift d) {
		this.driftt = d;
	}
	
	public abstract String drifting();


}
