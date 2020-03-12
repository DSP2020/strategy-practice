package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.Item;
import mx.iteso.marioKart.behaviorsInterfaces.Drifting;

/**
 * Clase BigDrift.
 */
public class BigDrift implements Drifting {
    /**
     *
     * @param currentVelocity velocidad actual.
     * @param item que el personaje toma.
     * @return un comentario sobre su aceleración.
     */
    public final String drift(final double currentVelocity, final Item item) {
        if (currentVelocity + item.getVelocity() > currentVelocity) {
            return "Big drifting";
        }
        return "stop";
    }
}
