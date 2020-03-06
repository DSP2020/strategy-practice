package characters;

import acceleration.Acceleration;
import item.Item;

public abstract class Character {
	private Acceleration acceleration;

	public void setAccelerationType(Acceleration a) {
		this.acceleration = a;
	}
	
	public void accelerationItem(Item i) {
		if(this.acceleration != null) acceleration.itemAcceleration(i);
	}
	
	public void accelerate() {
		acceleration.basicAcceleration();
	}
	
	public int getAcceleration() {
		return acceleration.getAcceleration();
	}
	
	abstract void startRunning();
}
