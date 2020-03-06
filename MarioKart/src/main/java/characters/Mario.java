package characters;

import acceleration.Fast;
import item.Champinon;

public class Mario extends Character{
	public Mario() {
		setAccelerationType(new Fast());
	}

	@Override
	public void startRunning() {
		System.out.println("Hello, it's me Mario:");
		System.out.println("I'll start the race");
		int time = 0;
		int itemTime = (int)(Math.random() * 10);
		
		while(time < 20) {
			try {
				if(time == itemTime) {
					this.accelerationItem(new Champinon());
				}
				
				this.accelerate();
				Thread.sleep(500);
				time ++;
			} catch (InterruptedException e) {}
		}
		
		System.out.println("I just finished the race, my acceleration was: " + this.getAcceleration());
	}
}
