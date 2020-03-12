package mx.iteso.mariokart.behavior.implement;
import mx.iteso.mariokart.behavior.*;
public class slow implements Acceleration{
	@Override
	public void accelerate() {
		System.out.println("Vas muy lento rapido");
	}
}
