package drifting;

import characters.Character;

/**
 * @author hecto
 *
 */
public abstract class Drifting {
/**
*/
private int drifting;

/**
 * @param i
 * int
*/
public Drifting(final int i) {
setDrifting(i);
}

/**
 * @param i
 * int
 */
private void setDrifting(final int i) {
this.drifting = i;
}

/**
 * @param c
 * Character
*/
public void drift(final Character c) {
System.out.println("Im about to drift... Check this out");
if (c.getAcceleration() > this.drifting) {
c.setAcceleration(this.drifting);
} else {
System.out.println("Hola");
}
}
}
