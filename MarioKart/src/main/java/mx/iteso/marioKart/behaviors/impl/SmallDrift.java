package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.Item;
import mx.iteso.marioKart.behaviorsInterfaces.Drifting;

/**
 * clase SmallDrift.
 */

public class SmallDrift implements Drifting {
    /**
     *
     * @param currentVelocity velocidad actual.
     * @param item que toma.
     * @return un string sobre el drifting del personaje.
     */
    public final String drift(final double currentVelocity, final Item item) {
        if (currentVelocity + item.getVelocity() > currentVelocity) {
            return "Small drifting";
        }
        return "stop";
    }
}
