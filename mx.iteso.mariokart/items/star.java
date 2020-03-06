package mx.iteso.mariokart.Items;
import mx.iteso.mariokart.Character;
import mx.iteso.mariokart.Items;
import mx.iteso.mariokart.behaviors.imp.fast;
import mx.iteso.mariokart.behaviors.Acceleration;
public class star extends Item{
	@Override
	public void changes(Character c) {
		Acceleration accelerationChange = c.getAcceleration();
		c.setAcceleration(new fast());
		c.getAcceleration().accelerate();
		c.setAcceleration(accelerationChange)
		
	}
}
