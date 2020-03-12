package characters;

import drift.Drift;
import drift.SlowDrifting;
/**
 * Bowser!
 *
 */
public class Bowser extends Character {
    /**
     * NAME!
     *
     */
    private static final String NAME = "Bowser";
    /**
     * STRENGTH!
     *
     */
    private static final int STRENGTH = 200;
    /**
     * MASS!
     *
     */
    private static final int MASS = 150;
    /**
     * MAXSPEED!
     *
     */
    private static final int MAXSPEED = 55;
    /**
     * driftBowser!
     *
     */
    private static Drift driftBowser = new SlowDrifting();
    /**
     * constructor!
     *
     */
    public Bowser() {
        super(STRENGTH,
                MASS,
                NAME,
                MAXSPEED,
                driftBowser);
    }
}
