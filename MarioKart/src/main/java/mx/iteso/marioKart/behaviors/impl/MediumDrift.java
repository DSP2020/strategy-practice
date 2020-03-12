package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.Item;
import mx.iteso.marioKart.behaviorsInterfaces.Drifting;

/**
 * clase MediumDrfit.
 */

public class MediumDrift implements Drifting {
    /**
     *
     * @param currentVelocity velocidad actual.
     * @param item que toma el personaje.
     * @return un string con un comentario con el derrape.
     */
    public final String drift(final double currentVelocity, final Item item) {
        if (currentVelocity + item.getVelocity() > currentVelocity) {
            return "Medium drifting";
        }
        return "stop";
    }
}
