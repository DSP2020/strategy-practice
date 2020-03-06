package characters;

import acceleration.Slow;
import item.Estrella;;

public class Bowser extends Character{
	public Bowser() {
		setAccelerationType(new Slow());
	}

	@Override
	public void startRunning() {
		System.out.println("Hello, it's me Bowser:");
		System.out.println("I'll start the race");
		
		int time = 0;
		int itemTime = (int)(Math.random() * 10);
		
		while(time < 20) {
			try {
				if(time == itemTime) {
					this.accelerationItem(new Estrella());
				}
				
				this.accelerate();
				Thread.sleep(500);
				time ++;
			} catch (InterruptedException e) {}
		}
		
		System.out.println("I just finished the race, my acceleration was: " + this.getAcceleration());
	}
	
}
