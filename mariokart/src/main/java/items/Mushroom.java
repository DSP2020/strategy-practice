package items;

import accelerations.Fast;
/**
 * Mushroom!
 */
public class Mushroom extends Item {
    /**
     * TIME!
     */
    private static final int TIME = 3;
    /**
     * NAME!
     */
    private static final String NAME = "Mushroom";
    /**
     * constuctor!
     */
    public Mushroom() {
        super(TIME, new Fast(), NAME);
    }
}
