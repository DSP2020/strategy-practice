package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.Normal;
import mx.iteso.mariokart.behaviors.impl.NormalDrift;

public class Mario extends MarioKartCharacter {
/**
 * Normal acceleration.
 */
private Acceleration acc = new Normal();
/**
 * Normal drift.
 */
private Drift dr = new NormalDrift();
}
