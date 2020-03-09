package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.impl.SlowAcceleration;

public class Bowser extends MarioKartCharacter {
    static Acceleration acceleration = new SlowAcceleration();

    public Bowser() {
        super(acceleration);
    }
}
