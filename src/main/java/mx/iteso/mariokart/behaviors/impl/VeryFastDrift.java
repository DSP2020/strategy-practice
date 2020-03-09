package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.iDrift;

/**
 * Very fast drifting interface.
 */
public class VeryFastDrift implements iDrift {

    /**
     * Mehod to return very fast drifting.
     * @return string of very fast drifting.
     */
    @Override
    public String drift() {
        return "very fast drifting";
    }
}
