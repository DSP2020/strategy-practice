package drift;

import characters.Character;
/**
 * SlowDrifting!
 */
public class SlowDrifting implements Drift {
    /**
     * EXITSPEED!
     */
    private static final int EXITSPEED = 25;
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
