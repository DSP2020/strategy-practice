package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.behaviors.IAcceleration;

public class Average implements IAcceleration {

    public String accelerationResult(int currentAcceleration) {
        String result ="";

        if(currentAcceleration <= 4 && currentAcceleration >9) {
            result = "Speed is normal";
        }

        return result;
    }
}

