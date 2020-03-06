package item;

public abstract class Item {
	private int time;
	private int rateAcceleration;
	
	public Item(int t, int ra) {
		this.setTime(t);
		this.setRateAcceleration(ra);
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getRateAcceleration() {
		return rateAcceleration;
	}

	public void setRateAcceleration(int ra) {
		this.rateAcceleration = ra;
	}
}
