package mx.iteso;

import mx.iteso.behaviors.impl.acceleration.NormalAcceleration;
import mx.iteso.characters.Yoshi;
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
        MarioKartCharacter yoshi = new Yoshi();
        Item star = new Star();
        yoshi.setAcceleration(new NormalAcceleration());
        System.out.println(yoshi.accelerate());
        yoshi.setItem(star);
        System.out.println(yoshi.accelerate());
        yoshi.useItem();
        System.out.println(yoshi.accelerate());
        System.out.println(yoshi.drift());
    }
}
