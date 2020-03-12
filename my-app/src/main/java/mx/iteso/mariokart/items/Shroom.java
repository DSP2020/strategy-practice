package mx.iteso.mariokart.items;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.impl.VeryFast;
import mx.iteso.mariokart.behaviors.impl.PerfectDrift;

public class Shroom extends Item {
/**
 * Change characters statistics based on item.
 */
@Override
public final void itemEffect(final MarioKartCharacter character) {
character.setAcceleration(new VeryFast());
character.setDrift(new PerfectDrift());
}
}
