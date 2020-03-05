package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Acceleration;

public class Slow implements Acceleration {
    public void drive(){
        System.out.println("Driving slowly");
    }

    public void stop(){
        System.out.println("Stopping slowly");
    }

    public void drift(){
        System.out.println("Drifting slowly");
    }
}
