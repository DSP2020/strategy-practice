package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.Character;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.implementation.NormalAcceleration;

/**
 * Bowser character implementation.
 */
public class DonkeyKong extends Character{

    Acceleration acceleration = new NormalAcceleration();

    /**
     * Prints the name of the character an the current acceleration.
     */
    @Override
    public void drive() {
        System.out.println("I am Donkey Kong");
        System.out.println("My acceleration is " + acceleration.accelerate());
    }

    /**
     * set acceleration.
     */
    public void setAcceleration (Acceleration acc) {
        this.acceleration = acc;
    }

    /**
     * get acceleration.
     * @return aceleration.
     */
    public Acceleration getAcceleration () {
        return this.acceleration;
    }
    
}
