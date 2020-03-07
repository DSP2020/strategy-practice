package accelerations;

import characters.Character;

public class Normal implements Acceleration {
    int modifierAcc = 1;
    static String name = "Normal acceleration";

    public void accelerate(Character c) {
        int newSpeed = c.getCurrentSpeed() + modifierAcc * (c.getStrength() / c.getMass());
        c.setCurrentSpeed(Math.min(newSpeed, c.getMaxSpeed()));
    }

    public String getName() {
        return name;
    }


}
