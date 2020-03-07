package mx.iteso.mariokart;

import mx.iteso.mariokart.characters.Mario;
import mx.iteso.mariokart.items.Mushroom;

/**
 * Hello world!
 *
 */
public final class App {
    /**
     * Making private the constructor.
     */
    private App() {

    }

    /**
     * Main function.
     * @param args the args passed in the terminal.
     */
    public static void main(final String[] args) {
        Mario mario = new Mario();
        mario.accelerate();

        Mushroom mushroom = new Mushroom();

        mario.setCurrentItem(mushroom);
        mario.executeItem();
    }
}
