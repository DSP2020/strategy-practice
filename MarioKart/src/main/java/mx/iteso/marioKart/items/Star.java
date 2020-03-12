package mx.iteso.marioKart.items;

import mx.iteso.marioKart.Item;

/**
 * clas Star.
 */

public class Star extends Item {
    /**
     * velodiad que da una estrella.
     */
    static final double STAR_VELOCITY = 1000;
    /**
     * duración de una estrella.
     */
    static final int STAR_DURATION = 100;

    /**
     * constructor.
     */
    public Star() {
        super(STAR_VELOCITY, STAR_DURATION);
    }
}

