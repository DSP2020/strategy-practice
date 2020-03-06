package mx.iteso.mariokart;

import mx.iteso.mariokart.characters.Mario;
import mx.iteso.mariokart.items.Mushroom;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Mario mario = new Mario();
        mario.accelerate();
        
        Mushroom mushroom = new Mushroom();

        mario.setCurrentItem(mushroom);
        mario.executeItem();
    }
}
