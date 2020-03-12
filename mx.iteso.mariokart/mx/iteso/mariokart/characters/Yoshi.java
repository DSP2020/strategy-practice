package mx.iteso.mariokart.characters;
import mx.iteso.mariokart.Character;
import mx.iteso.mariokart.behavior.*;
import mx.iteso.mariokart.behavior.implement.*;

public class Yoshi extends Character{
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
