package mx.iteso.strategy.characters;

import mx.iteso.strategy.Character;

/**
 * Bowser character implementation.
 */
public class Bowser extends Character{

    /**
     * Prints a message.
     */
    @Override
    public void drive() {
        System.out.println("I'm Browser");
    }
}