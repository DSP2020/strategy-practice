package mx.iteso.mariokart.items;
import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.impl.GoodDrift;
import mx.iteso.mariokart.behaviors.impl.VeryFast;

public class Hongo extends Item {
/**
 * Honguitos.
 */
@Override
public void activeItem(final MarioKartCharacter c) {
c.setAcelerate(new VeryFast());
c.setDrift(new GoodDrift());
}
}
