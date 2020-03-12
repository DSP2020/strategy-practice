package mx.iteso;

import mx.iteso.behaviors.impl.acceleration.NormalAcceleration;
import mx.iteso.characters.Yoshi;
import mx.iteso.items.Star;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
