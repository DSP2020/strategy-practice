package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.Item;
import mx.iteso.marioKart.behaviorsInterfaces.Acceleration;

/**
 * clase NegativeAcceleration.
 */

public class NegativeAcceleration implements Acceleration {
    /**
     *
     * @param currentVelocity velocidad actual.
     * @param item que toma el personaje.
     * @return un comentario sobre la aceleración.
     */
    public final String acceleration(final double currentVelocity,
                                     final Item item) {
        double incrementVelocity = currentVelocity;
        for (int i = 0; i < item.getDuration(); i++) {
            System.out.println("go slow");
            if (incrementVelocity <= 0) {
                System.out.println("Stop");
                return "stop";
            }
            System.out.println("new velocity " + incrementVelocity + " m/s");
            incrementVelocity += item.getVelocity();
        }

        return "go slow";
    }
}
