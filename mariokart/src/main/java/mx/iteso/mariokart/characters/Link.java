package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.Character;
import mx.iteso.mariokart.behaviors.implementation.FastAcceleration;
import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * Link character implementation.
 */
public class Link extends Character{

    Acceleration acceleration = new FastAcceleration();

    /**
     * Prints the name of the character an the current acceleration.
     */
    @Override
    public void drive() {
        System.out.println("I am Link");
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
