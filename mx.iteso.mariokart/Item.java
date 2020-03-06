package mx.iteso.mariokart
import mx.iteso.mariokart.behavior.Acceleration;

public abstract class Item {
	private String name;
	public abstract void changes(Character c);
}
