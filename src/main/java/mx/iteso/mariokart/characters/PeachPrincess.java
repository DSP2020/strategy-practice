package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.impl.MediumAcceleration;

public class PeachPrincess extends MarioKartCharacter {
    static Acceleration acceleration = new MediumAcceleration();

    public PeachPrincess() {
        super(acceleration);
    }
}
