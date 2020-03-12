package mx.iteso.marioKart.items;

import mx.iteso.marioKart.Item;

/**
 * Clase Thunder.
 */

public class Thunder extends Item {
    /**
     * Velocidad que te quita un rayo.
     */
    static final double THUNDER_VELOCITY = -100;
    /**
     * Duración de un rayo.
     */
    static final int THUNDER_DURATION = 10;

    /**
     * constructor.
     */
    public Thunder() {
        super(THUNDER_VELOCITY, THUNDER_DURATION);
    }
}
