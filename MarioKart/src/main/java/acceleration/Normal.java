package acceleration;

import item.Item;

public class Normal implements Acceleration {
	private int currentAcceleration;
	
	public Normal() {
		this.currentAcceleration = 0;
	}
	
	public void itemAcceleration(Item i) {
		System.out.println("ITEM ACCELERATION");

		int a = 0;
		
		while(a < i.getRateAcceleration()) {
			System.out.println("CURRENT ITEM ACCELERATION: " + getAcceleration());
			acceleration(i.getRateAcceleration());
			
			try {
				Thread.sleep(1000);
				a++;
			} catch (InterruptedException e) 
			{}
		}
		System.out.println("FINISHED ITEM ACCELERATION: " + getAcceleration());		
	}
	
	public int getAcceleration() {
		return this.currentAcceleration;
	}
	
	private void acceleration(int a) {
		this.currentAcceleration += a; 
	}

	public void basicAcceleration() {
		System.out.println("Actual acceleration: " + getAcceleration());
		this.currentAcceleration += 3; 
		System.out.println("New acceleration: " + getAcceleration());
	}
}
