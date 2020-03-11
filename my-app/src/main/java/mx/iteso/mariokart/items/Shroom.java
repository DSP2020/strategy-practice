package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.impl.*;

public class Shroom extends Item{

	@Override
	public void itemEffect(MarioKartCharacter character) {
		character.setAcceleration(new VeryFast());
		
	}

}
