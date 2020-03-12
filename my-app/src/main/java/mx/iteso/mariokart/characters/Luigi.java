package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.Fast;
import mx.iteso.mariokart.behaviors.impl.NormalDrift;

public class Luigi extends MarioKartCharacter {
	
	Acceleration luigiAc = new Fast();
	Drift drift = new NormalDrift();
}