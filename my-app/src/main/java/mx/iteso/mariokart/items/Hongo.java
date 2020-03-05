package mx.iteso.mariokart.items;
import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.impl.VeryFast;

public class Hongo extends Item {
	
	private int timeFinal = getTiempo();
	private int timeInicial = 0;
	
	@Override
	public void activeItem(MarioKartCharacter c) {
		Acceleration actual = c.getAcelerate();
		for(timeInicial = 0; timeInicial < timeFinal; timeInicial ++) {
			c.setAcelerate(new VeryFast());
			c.getAcelerate().setAcceleration();
		}
		c.setAcelerate(actual);
	}

}
