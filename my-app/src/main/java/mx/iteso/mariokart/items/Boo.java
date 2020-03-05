package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.impl.Slow;

public class Boo extends Item{
	private int effDuration = getDuration();
	private int elapsedTime = 0;

	@Override
	public void itemEffect(MarioKartCharacter character) {
		Acceleration originalAcc = character.getAcceleration();
		while(elapsedTime < effDuration) {
			character.setAcceleration(new Slow());
			character.getAcceleration().accelerate();
			elapsedTime++;
		}
		character.setAcceleration(originalAcc);
		
	}

}
