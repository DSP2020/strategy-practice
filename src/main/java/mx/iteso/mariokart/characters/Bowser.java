package mx.iteso.mariokart.characters;
import mx.iteso.mariokart.MariokartCharacter;
//import mx.iteso.mariokart.behaviors.IfAcceleration;
//import mx.iteso.mariokart.behaviors.impl.Fast;
/**
 * El personaje más op.
 */

public class Bowser extends MariokartCharacter {
    /**
     * Attr.
     * @return String
     */
    static final double BOWSERVEL = 100;
    /**
     * Attr.
     * @return String
     */
    private String currVelocity;
    //ifAcceleration aBowser = new Fast();

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
        this.currVelocity = newVel;
    }

    /**
     * Constructor.
     */
    public Bowser() {
        super(BowserVelocity);
        this.currVelocity = BowserVelocity;
    }

}
