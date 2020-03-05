package mx.iteso.strategy.characters;

import mx.iteso.strategy.Character;

/**
 * Mario character implementation.
 */
public class Mario extends Character{

    /**
     * Prints a message.
     */
    @Override
    public void drive() {
        System.out.println("I'm Mario");
    }
}