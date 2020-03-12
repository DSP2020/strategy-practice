package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.Normal;
import mx.iteso.mariokart.behaviors.impl.NormalDrift;

public class Mario extends MarioKartCharacter{
	Acceleration acc = new Normal();
	Drift dr = new NormalDrift();
}
