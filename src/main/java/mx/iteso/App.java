package mx.iteso;

import mx.iteso.behaviors.impl.acceleration.NormalAcceleration;
import mx.iteso.characters.Toad;
import mx.iteso.items.Star;

/**
 * App main class.
 */
public abstract class App {
    /**
     * main method.
     * @param args args.
     */
    public static void main(final String[] args) {
        MarioKartCharacter toad = new Toad();
        Item star = new Star();
        toad.setAcceleration(new NormalAcceleration());
        System.out.println(toad.accelerate());
        toad.setItem(star);
        System.out.println(toad.accelerate());
        toad.useItem();
        System.out.println(toad.accelerate());
    }
}
