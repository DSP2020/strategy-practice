package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.impl.SlowAcceleration;

public class Bowser extends MarioKartCharacter {
    Acceleration acceleration = new SlowAcceleration();
}
