package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.impl.NormalDrift;
import mx.iteso.mariokart.behaviors.impl.Slow;

public class Boo extends Item {
/**
 * Change characters statistics based on item.
 */
@Override
public final void itemEffect(final MarioKartCharacter character) {
character.setAcceleration(new Slow());
character.setDrift(new NormalDrift());
}
}
