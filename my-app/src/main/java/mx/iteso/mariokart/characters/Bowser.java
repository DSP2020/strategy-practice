package mx.iteso.mariokart.characters;
import mx.iteso.mariokart.MarioKartCharacter;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.Low;
import mx.iteso.mariokart.behaviors.impl.NormalDrift;

public class Bowser extends MarioKartCharacter {
/**
 * Aceleración.
 */
private Acceleration bowserAc = new Low();
/**
 * Drift.
 */
private Drift drift = new NormalDrift();
}

