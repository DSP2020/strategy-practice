package acceleration;

import item.Item;

public class Slow implements Acceleration {
	private int currentAcceleration;
	
	public Slow() {
		this.setCurrentAcceleration(0);
	}
	
	public void itemAcceleration(Item i) {
		System.out.println("ITEM ACCELERATION");

		int current = getAcceleration();
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
		
		setCurrentAcceleration(current);
	}
	
	public int getAcceleration() {
		return this.currentAcceleration;
	}

	private void setCurrentAcceleration(int ca) {
		this.currentAcceleration = ca;
	}
	
	private void acceleration(int a) {
		this.currentAcceleration += a; 
	}

	public void basicAcceleration() {
		System.out.println("Actual acceleration: " + getAcceleration());
		this.currentAcceleration ++; 
		System.out.println("New acceleration: " + getAcceleration());
	}
}
