package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.impl.Slow;

public class Wario extends MarioKartCharacter{
	Acceleration acc = new Slow();
}
