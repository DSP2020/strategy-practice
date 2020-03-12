package characters;

import drift.Drift;
import drift.FastDrifting;
/**
 * Toad!
 *
 */
public class Toad extends Character {
    /**
     * NAME!
     *
     */
    private static final String NAME = "Toad";
    /**
     * STRENGTH!
     *
     */
    private static final int STRENGTH = 100;
    /**
     * MASS!
     *
     */
    private static final int MASS = 20;
    /**
     * MAXSPEED!
     *
     */
    private static final int MAXSPEED = 42;
    /**
     * driftToad!
     *
     */
    private static Drift driftToad = new FastDrifting();
    /**
     * constructor!
     *
     */
    public Toad() {
        super(STRENGTH,
                MASS,
                NAME,
                MAXSPEED,
                driftToad);
    }
}
