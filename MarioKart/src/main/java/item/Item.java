package item;

/**
 * @author hecto
 *
 */
public abstract class Item {
/**
*/
private int time;

/**
*/
private int rateAcceleration;

/**
 * @param t
 * int
 * @param ra
 * int
*/
public Item(final int t, final int ra) {
this.setTime(t);
this.setRateAcceleration(ra);
}

/**
 * @return int
*/
public final int getTime() {
return time;
}

/**
 * @param t
 * int
*/
public final void setTime(final int t) {
this.time = t;
}

/**
 * @return int
*/
public final int getRateAcceleration() {
return rateAcceleration;
}

/**
 * @param ra
 * int
*/
public final void setRateAcceleration(final int ra) {
this.rateAcceleration = ra;
}
}
