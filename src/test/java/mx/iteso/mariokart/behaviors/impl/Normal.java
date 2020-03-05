package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class Normal implements Acceleration {

    public void drive(){
        System.out.println("Driving normally");
    }

    public void stop(){
        System.out.println("Stopping normally");
    }

    public void drift(){
        System.out.println("Drifting normally");
    }
}
