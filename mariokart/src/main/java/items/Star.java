package items;

import accelerations.Fast;

public class Star extends Item {
    static int starTime = 10;
    static String starName = "Star";

    public Star() {
        super(starTime, new Fast(), starName);
    }
}
