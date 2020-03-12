package mx.iteso.mariokart.behaviors.implementation;

import mx.iteso.mariokart.behaviors.Drifting;

public class Drift implements Drifting {

    /**
     * It return that there´s drift.
     * @return The drift.
     */
    @Override
    public String drift() {
        String str = "You drive like a men!";
        return str;
    }

}
