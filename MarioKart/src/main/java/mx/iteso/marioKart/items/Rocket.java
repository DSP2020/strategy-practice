package mx.iteso.marioKart.items;

import mx.iteso.marioKart.Item;

/**
 * clase Rocket.
 */
public class Rocket extends Item {
    /**
     * Velocidad que te da un cohete.
     */
    static final double ROCKET_VELOCITY = 1000000;
    /**
     *Duración del cohete.
     */
    static final int ROCKET_DURATION = 10000;

    /**
     * constructor.
     */
    public Rocket() {
        super(ROCKET_VELOCITY, ROCKET_DURATION);
    }
}
