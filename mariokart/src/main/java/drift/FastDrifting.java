package drift;

import characters.Character;
/**
 * FastDrifting!
 *
 */
public class FastDrifting implements Drift {
    /**
     * EXITSPEED!
     *
     */
    private static final int EXITSPEED = 35;
    /**
     * drifting!
     *@param c
     * jajaja
     */
    public void drifting(final Character c) {
        if (c.getCurrentSpeed()
                > this.EXITSPEED) {
            c.setCurrentSpeed(this.EXITSPEED);
        }
    }
}
