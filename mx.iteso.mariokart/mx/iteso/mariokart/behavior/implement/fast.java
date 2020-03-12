package mx.iteso.mariokart.behavior.implement;
import mx.iteso.mariokart.behavior.Acceleration;
public class fast implements Acceleration{
	@Override
	public void accelerate() {
		System.out.println("Vas muy rapido");
	}
}
