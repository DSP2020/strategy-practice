package mx.iteso.mariokart;

import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;

public abstract class MarioKartCharacter {
/**
 * Acceleration.
 */
private Acceleration acc;
/**
 * Drift.
 */
private Drift dr;
/**
 * Get acceleration.
 * @return Acceleration
 */
public Acceleration getAcceleration() {
return this.acc;
}
/**
 * Set acceleration.
 * @param a
 */
public void setAcceleration(final Acceleration a) {
this.acc = a;
}
/**
 * Get drift.
 * @return Drift
 */
public Drift getDrift() {
return this.dr;
}
/**
 * set Drift.
 * @param d
 */
public void setDrift(final Drift d) {
this.dr = d;
}
/**
 * Define active item on character.
 * @param item
 */
public void activeItem(final Item item) {
item.itemEffect(this);
}
}
