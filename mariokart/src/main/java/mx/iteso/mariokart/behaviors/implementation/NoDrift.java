package mx.iteso.mariokart.behaviors.implementation;

import mx.iteso.mariokart.behaviors.Drifting;

public class NoDrift implements Drifting {

    /**
     * It return that there´s no drift.
     * @return The drift.
     */
    @Override
    public String drift() {
        String str = "You drive like a baby";
        return str;
    }
}
