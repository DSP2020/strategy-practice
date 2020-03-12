package mx.iteso.marioKart.behaviorsInterfaces;

import mx.iteso.marioKart.Item;

/**
 * interface Drifting.
 */

public interface Drifting {
    /**
     *
     * @param currentVelocity velocidad final.
     * @param item que toma el mono.
     * @return un string sobre el drifting.
     */
    String drift(double currentVelocity, Item item);
}
