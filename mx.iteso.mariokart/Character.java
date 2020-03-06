package mx.iteso.mariokart
import mx.iteso.mariokart


public abstract class Character implements Acceleration{
	private Acceleration accelerate; 
	
	
    public void setAcceleration(int a) {
        this.accelerate = a;
    }

    public int getAcceleration() {
        return this.accelerate;
    }
	
	public void useItem(Item item) {
		item.changes(this);
	}
}
