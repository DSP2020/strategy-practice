package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.behavior.Acceleration;
import mx.iteso.mariokart.behavior.Drift;
import mx.iteso.mariokart.behavior.implement.medium;
import mx.iteso.mariokart.behavior.implement.normaldrift;
import mx.iteso.mariokart.Character;


public class Babymario extends Character{
	Acceleration accelerate = new medium();
	Drift drift = new normaldrift();

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return accelerate.toString();
	}

	@Override
	public String drifting() {
		// TODO Auto-generated method stub
		return drift.toString();
	}
}
