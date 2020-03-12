package mx.iteso.marioKart.characters;

import mx.iteso.marioKart.MarioKartCharacter;

/**
 * clase Mario.
 */
public class Mario extends MarioKartCharacter {
    /**
     * Velocidad normal de Mario.
     */
   public static final double MARIO_VELOCITY = 150;
    /**
     * velocidad actual de Mario.
     */
   private double currentVelocity;

    /**
     * constructor.
     */

    public Mario() {
        super(MARIO_VELOCITY);
        this.currentVelocity = MARIO_VELOCITY;
    }

    /**
     *
     * @return la velocidad actual.
     */

    public final double getCurrentVelocity() {
        return this.currentVelocity;
    }

    /*Dummy Method for dummy testing
    public void changeAcceleration(double currentVelocity, Item item){
        super.getAcceleration().acceleration(currentVelocity,item);
        this.currentVelocity = MarioVelocity;
    }*/

}
