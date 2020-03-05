package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.IAcceleration;
import mx.iteso.strategy.behaviors.impl.NormalAcceleration;
import mx.iteso.strategy.behaviors.impl.SlowAcceleration;
import mx.iteso.strategy.characters.Mario;
import mx.iteso.strategy.items.Mushroom;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        IAcceleration acc = new SlowAcceleration();
        Character mario = new Mario();
        Item i = new Mushroom();
        mario.setAcceleration(acc);
        mario.setItem(i);
        mario.accelerate();
        mario.useItem();
        mario.accelerate();
    }
}
