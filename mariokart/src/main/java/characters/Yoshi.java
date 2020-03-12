package characters;

import drift.Drift;
import drift.NormalDrifting;
/**
 * Yoshi!
 *
 */
public class Yoshi extends Character {
    /**
     * NAME!
     *
     */
    private static final String NAME = "Yoshi";
    /**
     * STRENGTH!
     *
     */
    private static final int STRENGTH = 150;
    /**
     * MASS!
     *
     */
    private static final int MASS = 60;
    /**
     * MAXSPEED!
     *
     */
    private static final int MAXSPEED = 50;
    /**
     * driftYoshi!
     *
     */
    private static Drift driftYoshi = new NormalDrifting();
    /**
     * constructor!
     *
     */
    public Yoshi() {
        super(STRENGTH,
                MASS,
                NAME,
                MAXSPEED,
                driftYoshi);
    }
}
