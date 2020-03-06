package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.behaviors.IAcceleration;

public class Quick implements IAcceleration {

    public String accelerationResult(int currentAcceleration) {
        String result ="";

        if(currentAcceleration <=9) {
            result = "Speed is very fast";
        }

        return result;
    }
}
