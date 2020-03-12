package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.impl.BadDrift;
import mx.iteso.mariokart.behaviors.impl.VerySlow;

public class Bolt extends Item{

	@Override
	public void itemEffect(MarioKartCharacter character) {	
		character.setAcceleration(new VerySlow());
		character.setDrift(new BadDrift());
	}

}
