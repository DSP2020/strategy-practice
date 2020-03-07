package accelerations;

import characters.Character;

public class Fast implements Acceleration {
    int modifierAcc = 3;
    static String name = "Fast acceleration";

    public void accelerate(Character c) {
        int newSpeed = c.getCurrentSpeed() + modifierAcc * (c.getStrength() / c.getMass());
        c.setCurrentSpeed(Math.min(newSpeed, c.getMaxSpeed()));
    }
    public String getName() {
        return name;
    }
}