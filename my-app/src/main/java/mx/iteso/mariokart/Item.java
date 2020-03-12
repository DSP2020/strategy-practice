package mx.iteso.mariokart;

public abstract class Item {
/**
*Duration.
*/
private int duration;
/**
 * Item effect function.
 * @param character
 */
public abstract void itemEffect(MarioKartCharacter character);
/**
 * Get duration.
 * @return int
 */
public final int getDuration() {
return this.duration;
}
/**
 * Set duration.
 * @param time
 */
public void setDuration(final int time) {
this.duration = time;
}
}
