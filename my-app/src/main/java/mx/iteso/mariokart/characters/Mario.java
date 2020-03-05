package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.impl.Normal;

public class Mario extends MarioKartCharacter{
	Acceleration acc = new Normal();
}
