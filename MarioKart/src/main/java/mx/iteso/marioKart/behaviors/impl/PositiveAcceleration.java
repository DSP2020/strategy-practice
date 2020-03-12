package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.Item;
import mx.iteso.marioKart.behaviorsInterfaces.Acceleration;

/**
 * clase PositiveAceleration.
 */

public class PositiveAcceleration implements Acceleration {
    /**
     *
     * @param currentVelocity velocidad actual.
     * @param item que toma el personaje.
     * @return un string de la aceleración.
     */
    public final String acceleration(final double currentVelocity,
                                     final Item item) {
        double incrementVelocity = currentVelocity;
        for (int i = 0; i < item.getDuration(); i++) {
            if (incrementVelocity <= 0) {
                System.out.println("Stop");
                return "stop";
            }
            System.out.println("go fast!");
            System.out.println("new velocity " + incrementVelocity + " m/s");
            incrementVelocity += item.getVelocity();
        }

        return "go fast!";
    }
}
