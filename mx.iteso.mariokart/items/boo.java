package mx.iteso.mariokart.Items;
import mx.iteso.mariokart.Character;
import mx.iteso.mariokart.Items;
import mx.iteso.mariokart.behaviors.imp.medium;
import mx.iteso.mariokart.behaviors.Acceleration;

public class boo {

	@Override
	public void changes(Character c) {
		Acceleration accelerationChange = c.getAcceleration();
		c.setAcceleration(new medium());
		c.getAcceleration().accelerate();
		c.setAcceleration(accelerationChange)
	}
}
