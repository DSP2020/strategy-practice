package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.impl.FastAcceleration;

public class DryBones extends MarioKartCharacter {
    Acceleration acceleration = new FastAcceleration();
}
