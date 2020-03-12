package mx.iteso.mariokart.items;
import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.impl.GoodDrift;
import mx.iteso.mariokart.behaviors.impl.SoFast;


public class BilBall extends Item {
/**
 * BilBall.
 */
@Override
public void activeItem(final MarioKartCharacter c) {
c.setAcelerate(new SoFast());
c.setDrift(new GoodDrift());
}
}
