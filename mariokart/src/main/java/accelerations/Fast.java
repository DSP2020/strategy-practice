package accelerations;

import characters.Character;
/**
 * Fast!
 *
 */
public class Fast implements Acceleration {
    /**
     * MODIFIERACC!
     */
    private static final int MODIFIERACC = 3;
    /**
     * name!
     */
    private static String name = "Fast acceleration";
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
