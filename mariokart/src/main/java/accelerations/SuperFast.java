package accelerations;

import characters.Character;
/**
 * SuperFast!
 *
 */
public class SuperFast implements Acceleration {
    /**
     * MODIFIERACC!
     */
    private static final int MODIFIERACC  = 10;
    /**
     * name!
     */
    private static String name = "SuperFast acceleration";
    /**
     * accelerate!
     *@param c
     * jajaja
     */
    public void accelerate(final Character c) {
        int newSpeed = c.getCurrentSpeed()
                + MODIFIERACC * (c.getStrength() / c.getMass());
        c.setCurrentSpeed(Math.min(newSpeed, c.getMaxSpeed()));
    }
    /**
     * getName!
     *@return String
     * jajaja
     */
    public String getName() {
        return name;
    }
}
