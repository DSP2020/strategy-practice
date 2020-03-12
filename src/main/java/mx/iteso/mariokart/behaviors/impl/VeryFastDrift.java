package mx.iteso.mariokart.behaviors.impl;
import mx.iteso.mariokart.behaviors.IfDrift;
/**
 * El drifting más rápido del oeste.
 */

public class VeryFastDrift implements IfDrift {
    /**
     * Setter.
     * @return String
     */
    @Override
    public String setDrifting() {
        return "Drifting very fast alv";
    }
}
