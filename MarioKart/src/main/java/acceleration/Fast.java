package acceleration;

import item.Item;

public class Fast implements Acceleration {
	private int currentAcceleration;
	
	public Fast() {
		this.currentAcceleration = 0;
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
		System.out.println("Slow down, you are going to fast. Be careful");
		setAcceleration(current);
	}
	
	public int getAcceleration() {
		return currentAcceleration;
	}

	private void setAcceleration(int ca) {
		this.currentAcceleration = ca;
	}
	
	private void acceleration(int a) {
		this.currentAcceleration += a; 
	}

	public void basicAcceleration() {
		System.out.println("Actual acceleration: " + getAcceleration());
		this.currentAcceleration += 5; 
		System.out.println("New acceleration: " + getAcceleration());
	}
}
