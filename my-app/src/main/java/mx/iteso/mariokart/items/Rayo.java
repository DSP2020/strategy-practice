package mx.iteso.mariokart.items;
import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.impl.BadDrift;
import mx.iteso.mariokart.behaviors.impl.VeryLow;

public class Rayo extends Item {
/**
 * Raio.
 */
@Override
public void activeItem(final MarioKartCharacter c) {
c.setAcelerate(new VeryLow());
c.setDrift(new BadDrift());
}
}
