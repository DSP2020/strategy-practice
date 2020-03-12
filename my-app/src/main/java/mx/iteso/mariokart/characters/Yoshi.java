package mx.iteso.mariokart.characters;

import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.Fast;
import mx.iteso.mariokart.behaviors.impl.NormalDrift;

public class Yoshi extends MarioKartCharacter {
/**
 * Fast acceleration.
 */
private Acceleration acc = new Fast();
/**
 * Normal drift.
 */
private Drift dr = new NormalDrift();
}
