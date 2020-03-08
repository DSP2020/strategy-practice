package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Drift;

/**
 * Slow drift implementation for the drift
 * behavior.
 */
public class SlowDrift implements Drift {

    /**
     * Execute the drift accion.
     * @return the string drifting
     */
    @Override
    public String drift() {
        return "Slow drift";
    }

}
