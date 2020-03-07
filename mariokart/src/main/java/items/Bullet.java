package items;

import accelerations.SuperFast;
import characters.Character;

public class Bullet extends Item {
    static int bulletTime = 50;
    static String bulletName = "bullet";

    public Bullet() {
        super(bulletTime, new SuperFast(), bulletName);
    }
}
