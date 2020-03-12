package mx.iteso.mariokart.characters;
import mx.iteso.mariokart.MariokartCharacter;
//import mx.iteso.mariokart.behaviors.ifAcceleration;
//import mx.iteso.mariokart.behaviors.impl.Fast;
/**
 * El personaje más ogt.
 */


public class Luigi extends MariokartCharacter {
    /**
     * Attr.
     * @return String
     */
    static final double LUIGIVEL = 150;
    /**
     * Attr.
     * @return String
     */
    private String currVelocity;
    //ifAcceleration acLuigi = new Fast();

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
     * Constructor..
     */
    public Luigi() {
        super(LuigiVelocity);
        this.currVelocity = LuigiVelocity;
    }

}
