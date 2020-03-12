package items;

import accelerations.SuperFast;
/**
 * BULLET!
 *
 */
public class Bullet extends Item {
    /**
     * TIME!
     *
     */
    private static final int TIME = 5;
    /**
     * NAME!
     *
     */
    private static final String NAME = "bullet";
    /**
     * constructor!
     *
     */
    public Bullet() {
        super(TIME, new SuperFast(), NAME);
    }
}
