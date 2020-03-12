package mx.iteso.mariokart;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;

public abstract class MarioKartCharacter {
/**
 * Aceleracción.
 */
private Acceleration al;
/**
 * Drift.
 */
private Drift drift;
/**
 * Get aceleración.
 * @return al
 */
public Acceleration getAcelerate() {
return al;
}
/**
 * Set aceleración.
 * @param ab
 */
public void setAcelerate(final Acceleration ab) {
this.al = ab;
}
/**
 * Tomar efecto del item.
 * @param a
 */
public void takeEffect(final Item a) {
a.activeItem(this);
}
/**
 * Get drift.
 * @return drift
 */
public Drift getDrift() {
return drift;
}
/**
 * Set drift.
 * @param dr
 */
public void setDrift(final Drift dr) {
this.drift = dr;
}
}
