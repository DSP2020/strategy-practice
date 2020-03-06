package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;

public abstract class MarioKartCharacter {
    public Acceleration getActualAcceleration() {
        return actualAcceleration;
    }

    Acceleration actualAcceleration;

    public void setActualAcceleration(Acceleration a) {
        this.actualAcceleration = a;
    }

}
