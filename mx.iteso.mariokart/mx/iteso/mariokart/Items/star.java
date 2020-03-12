package mx.iteso.mariokart.Items;
import mx.iteso.mariokart.behavior.*;
import mx.iteso.mariokart.behavior.implement.fast;
import mx.iteso.mariokart.behavior.implement.normaldrift;
import mx.iteso.mariokart.Character;
import mx.iteso.mariokart.Item;

public class star extends Item{
	@Override
	public void changes(Character c) {
		Acceleration accelerationChange = c.getAcceleration();
		c.setAcceleration(new fast());
		c.getAcceleration().accelerate();
		c.setAcceleration(accelerationChange);
		Drift driftingChange = c.getDrift();
		c.setDrift(new normaldrift());
		c.getDrift().drifting();
		c.setDrift(driftingChange);
		
	}
}
