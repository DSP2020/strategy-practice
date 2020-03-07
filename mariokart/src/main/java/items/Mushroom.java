package items;

import accelerations.Fast;

public class Mushroom extends Item {
    static int mushroomTime = 3;
    static String mushroomName = "Mushroom";

    public Mushroom() {
        super(mushroomTime, new Fast(), mushroomName);
    }
}
