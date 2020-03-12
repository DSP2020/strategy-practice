package items;

import accelerations.Fast;
/**
 * Star!
 */
public class Star extends Item {
    /**
     * TIME!
     */
    private static final int TIME = 10;
    /**
     * NAME!
     */
    private static final String NAME = "Star";
    /**
     * constructor!
     */
    public Star() {
        super(TIME, new Fast(), NAME);
    }
}
