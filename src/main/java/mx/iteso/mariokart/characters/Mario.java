package mx.iteso.mariokart.characters;
import mx.iteso.mariokart.MariokartCharacter;
//import mx.iteso.mariokart.behaviors.ifAcceleration;
//import mx.iteso.mariokart.behaviors.impl.Fast;
/**
 * El personaje que todos quieren pero la neta está bn chafa.
 */

public class Mario extends MariokartCharacter {
    /**
     * Attr.
     */
    static final double MARIOVEL = 200;
    /**
     * Attr.
     * @param newVel
     */
    private String currVelocity;
    //ifAcceleration acMario = new Fast();

    /**
     * Getter.
     * @return String
     */
    public String getCurrentVelocity() {
        return this.currVelocity;
    }

    /**
     * Setter.
     * @param newVel
     */
    public void setCurrentVelocity(final String newVel) {
        this.currVelocity = v;
    }

    /**
     * Setter.
     */
    public Mario() {
        super(MarioVelocity);
        this.currVelocity = MarioVelocity;
    }
}
