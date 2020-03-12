package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.Character;
import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.implementation.FastAcceleration;
import mx.iteso.mariokart.behaviors.Acceleration;

/**
 * Link character implementation.
 */
public class Link extends Character {

    /**
    * Variable acceleration.
    */
    private Acceleration acceleration = new FastAcceleration();
    /**
    * VAriable Item.
    */
    private Item item;

    /**
     * Prints the name of the character an the current acceleration.
     */
    @Override
    public String drive() {
        String str = "I am Link";
        return str;
    }

    /**
     * set acceleration.
     * @param acc it is the new acceleration.
     */
    public void setAcceleration(final Acceleration acc) {
        this.acceleration = acc;
    }

    /**
     * get acceleration.
     * @return aceleration.
     */
    public Acceleration getAcceleration() {
        return this.acceleration;
    }

    /**
     * Sets the item.
     * @param itemNew the item to set.
     */
    public void setItem(final Item itemNew) {
        this.item = itemNew;
    }

    /**
     * Gets the item.
     * @return the item.
     */
    public Item getItem() {
        return item;
    }
}
