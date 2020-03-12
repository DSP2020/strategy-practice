package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.impl.NormalDrift;
import mx.iteso.mariokart.behaviors.impl.Slow;

public class Boo extends Item{

	@Override
	public void itemEffect(MarioKartCharacter character) {
		character.setAcceleration(new Slow());
		character.setDrift(new NormalDrift());
	}

}
