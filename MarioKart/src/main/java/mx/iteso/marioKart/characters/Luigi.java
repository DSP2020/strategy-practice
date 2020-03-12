package mx.iteso.marioKart.characters;

import mx.iteso.marioKart.MarioKartCharacter;

/**
 * clase Luigi.
 */
public class Luigi extends MarioKartCharacter {
    /**
     * velocidad normal de un personaje Luigi.
     */
    static final double LUIGI_VELOCITY = 170;
    /**
     *
     */
    private double currentVelocity;

    /**
     * Constructor.
     */

    public Luigi() {
        super(LUIGI_VELOCITY);
        this.currentVelocity = LUIGI_VELOCITY;
    }

    /**
     *
     * @return la velocidad actual de Luigi.
     */

    public final double getCurrentVelocity() {
        return this.currentVelocity;
    }

    /*
    Dummy method for dummy testing
    public void changeAcceleration(double currentVelocity, Item item){
        super.getAcceleration().acceleration(currentVelocity,item);
        this.currentVelocity = LuigiVelocity;
    }*/

}
