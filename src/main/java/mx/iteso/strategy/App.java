package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.IAcceleration;
import mx.iteso.strategy.behaviors.impl.SlowAcceleration;
import mx.iteso.strategy.characters.Mario;
import mx.iteso.strategy.items.Mushroom;

/**
 * Clase de ejecución APP.
 */
public class App {

    /**
     * Constructor de APP.
     */
    protected App() {
        System.out.print(Integer.BYTES);
    }

    /**
     * Método de ejecución.
     * @param args Parámetros de ejecución.
     */
    public static void main(final String[] args) {
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
