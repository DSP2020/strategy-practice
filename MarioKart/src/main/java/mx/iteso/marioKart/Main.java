package mx.iteso.marioKart;

import mx.iteso.marioKart.behaviors.impl.MediaAcceleration;
import mx.iteso.marioKart.behaviors.impl.PositiveAcceleration;
import mx.iteso.marioKart.behaviorsInterfaces.Acceleration;
import mx.iteso.marioKart.characters.Luigi;
import mx.iteso.marioKart.characters.Mario;
import mx.iteso.marioKart.characters.Toad;
import mx.iteso.marioKart.items.Rocket;
import mx.iteso.marioKart.items.Star;
import mx.iteso.marioKart.items.Thunder;

public class Main {
    public static void main(String[] args){
        /*MarioKartCharacter Mario = new Mario();
        Item star = new Star();
        Acceleration media = new MediaAcceleration();
        Mario.setAceleration(media);
        Mario.changeAcceleration(Mario.getCurrentVelocity(),star);
        System.out.println("Continue it's way, current velocity m/s"+Mario.getCurrentVelocity());*/

        /*MarioKartCharacter Luigi = new Luigi();
        Item thunder = new Thunder();
        Acceleration positive = new PositiveAcceleration();
        Luigi.setAceleration(positive);
        Luigi.changeAcceleration(Luigi.getCurrentVelocity(),thunder);
        System.out.println("Continue it's way, current velocity "+Luigi.getCurrentVelocity()+"m/s");*/

        MarioKartCharacter Toad = new Toad();
        Item rocket = new Rocket();
        Acceleration positive = new PositiveAcceleration();
        Toad.setAceleration(positive);
        Toad.changeAcceleration(Toad.getCurrentVelocity(),rocket);
        System.out.println("Continue it's way, current velocity "+Toad.getCurrentVelocity() +" m/s");

    }
}
