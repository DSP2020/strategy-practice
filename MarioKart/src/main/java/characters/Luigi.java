package characters;

import acceleration.Normal;
import item.Moneda;

public class Luigi extends Character{
	public Luigi() {
		setAccelerationType(new Normal());
	}

	public void startRunning() {
		System.out.println("Hello, it's me Luigi:");
		System.out.println("I'll start the race");
		
		int time = 0;
		int itemTime = (int)(Math.random() * 10);
		
		while(time < 20) {
			try {
				if(time == itemTime) {
					this.accelerationItem(new Moneda());
				}				
				this.accelerate();
				Thread.sleep(500);
				time ++;
			} catch (InterruptedException e) {}
		}

		System.out.println("I just finished the race, my acceleration was: " + this.getAcceleration());
	}
}
