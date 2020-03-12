package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.GreatDrift;
import mx.iteso.mariokart.behaviors.impl.Slow;

public class Wario extends MarioKartCharacter {
/**
 * Slow acceleration.
 */
private Acceleration acc = new Slow();
/**
 * Great drift.
 */
private Drift dr = new GreatDrift();
}
