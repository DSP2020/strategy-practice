package mx.iteso.mariokart.behaviors.imp;
import mx.iteso.mariokart.behaviors.Acceleration;
public class slow implements Acceleration{
	@Override
	public void accelerate() {
		System.out.println("Vas lento")
	}
}
