package mx.iteso.mariokart.items;
import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.impl.GoodDrift;
import mx.iteso.mariokart.behaviors.impl.NormalDrift;
import mx.iteso.mariokart.behaviors.impl.VeryFast;

public class Hongo extends Item {
	
	@Override
	public void activeItem(MarioKartCharacter c) {
		c.setAcelerate(new VeryFast());
		c.setDrift(new GoodDrift());
	}
}