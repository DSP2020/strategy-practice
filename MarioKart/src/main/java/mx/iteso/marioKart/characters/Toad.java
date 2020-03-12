package mx.iteso.marioKart.characters;

import mx.iteso.marioKart.MarioKartCharacter;

/**
 * clase Toad.
 */
public class Toad extends MarioKartCharacter {
    /**
     * Velocidad del personaje Toad.
     */
    static final double TOAD_VELOCITY = 55;
    /**
     * velocidad actual.
     */
    private double currentVelocity;

    /**
     * constructor.
     */

    public Toad() {
        super(TOAD_VELOCITY);
        this.currentVelocity = TOAD_VELOCITY;
    }

    /**
     *
     * @return la velocidad actual.
     */

    public final double getCurrentVelocity() {
        return this.currentVelocity;
    }

    /*
    Dummy method for dummy testing
    public void changeAcceleration(double currentVelocity, Item item){
        super.getAcceleration().acceleration(currentVelocity,item);
        this.currentVelocity = ToadVelocity;
    }*/

}
