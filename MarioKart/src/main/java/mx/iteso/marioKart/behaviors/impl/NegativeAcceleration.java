package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.Item;
import mx.iteso.marioKart.behaviorsInterfaces.Acceleration;

public class NegativeAcceleration implements Acceleration {
    public void acceleration(double currentVelocity, Item item) {
        double incrementVelocity = currentVelocity;
        for(int i=0; i<item.getDuration(); i++){
            System.out.println("go slow");
            if (incrementVelocity == 0){
                System.out.println("Stop");
                break;
            }
            System.out.println("new velocity "+incrementVelocity);
            incrementVelocity += item.getVelocity();
        }
    }
}
