package accelerations;

import characters.Character;

public class SuperFast implements Acceleration{
    int modifierAcc = 5;
    static String name = "SuperFast acceleration";

    public void accelerate(Character c) {
        int newSpeed = c.getCurrentSpeed() + modifierAcc * (c.getStrength() / c.getMass());
        c.setCurrentSpeed(Math.min(newSpeed, c.getMaxSpeed()));
    }
    public String getName() {
        return name;
    }
}
