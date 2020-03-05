package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.impl.*;

public class Shroom extends Item{

	private int effDuration = getDuration();
	private int elapsedTime = 0;
	@Override
	public void itemEffect(MarioKartCharacter character) {
		Acceleration originalAcc = character.getAcceleration();
		while(elapsedTime < effDuration) {
			if(originalAcc == new Slow()) {
				character.setAcceleration(new Fast());
			} 
			else if (originalAcc == new Normal()) {
				character.setAcceleration(new VeryFast());
			}
			else if (originalAcc == new Fast()) {
				character.setAcceleration(new VeryFast());
			}
			else if (originalAcc == new VerySlow()) {
				character.setAcceleration(new Fast());
			}
			character.getAcceleration().accelerate();
			elapsedTime++;
		}
		character.setAcceleration(originalAcc);
		
	}

}
