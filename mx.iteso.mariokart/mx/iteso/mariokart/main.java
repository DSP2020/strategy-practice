package mx.iteso.mariokart;

import mx.iteso.mariokart.Items.boo;
import mx.iteso.mariokart.Items.mushroom;
import mx.iteso.mariokart.behavior.Acceleration;
import mx.iteso.mariokart.behavior.implement.fast;
import mx.iteso.mariokart.characters.Bowser;
import mx.iteso.mariokart.characters.Yoshi;


public interface main {
	public static void main(final String[] args) {
		Item it = new mushroom();
		Acceleration accelerate = new fast();
		Character bowser = new Bowser();
		bowser.setAcceleration(accelerate);
		bowser.useItem(it);
		bowser.accelerate();
		bowser.drifting();
		
	}
}
