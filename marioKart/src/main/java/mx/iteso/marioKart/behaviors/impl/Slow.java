package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.behaviors.IAcceleration;

public class Slow implements IAcceleration {

    public String accelerationResult(int currentAcceleration) {
        String result ="";

        if(currentAcceleration > 4) {
            result = "Speed is very slow";
        }

        return result;
    }
}
