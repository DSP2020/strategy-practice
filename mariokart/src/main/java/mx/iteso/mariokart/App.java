package mx.iteso.mariokart;

import mx.iteso.mariokart.characters.*;
import mx.iteso.mariokart.items.*;

/**
 * Application
 */
public class App {
    public static void main(String[] args) {
        DonkeyKong DKOriginal = new DonkeyKong();
        Character DK = new DonkeyKong();
        Item actualItem = new Star();
        DK.setAccelerationAb(DKOriginal.getAcceleration());
        DK.setItem(actualItem);
        DK.accelerate();
        DK.useItem();
        DK.accelerate();
    }
}
