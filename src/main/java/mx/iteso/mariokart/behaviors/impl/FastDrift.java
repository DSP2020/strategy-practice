package mx.iteso.mariokart.behaviors.impl;

import mx.iteso.mariokart.behaviors.iDrift;

/**
 * Fast drift interface.
 */
public class FastDrift implements iDrift {

    /**
     * Drifting method
     * @return the drifting action string.
     */
    @Override
    public String drift() {
        return "Fast drifting";
    }
}
