package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.Drift;

/**
 * Fast drift implementation for the drift
 * behavior.
 */
public class FastDrift implements Drift {

    /**
     * Execute the drift accion.
     * @return the string drifting
     */
    @Override
    public String drift() {
        return "Fast drift";
    }

}
