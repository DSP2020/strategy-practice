package drift;

import characters.Character;
/**
 * NormalDrifting!
 *
 */
public class NormalDrifting implements Drift {
    /**
     * EXITSPEED!
     *
     */
    private static final int EXITSPEED = 30;
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
