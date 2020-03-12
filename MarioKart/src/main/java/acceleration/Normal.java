package acceleration;

import item.Item;

/**
 * @author hecto
 *
 */
public class Normal implements Acceleration {
/**
*/
private int currentAcceleration;

/**
*/
private final int sleepTime = 1000;

/**
*/
private final int accelarate = 3;

/**
*/
public Normal() {
this.currentAcceleration = 0;
}

/**
 * @param i
 * Item
*/
public final void itemAcceleration(final Item i) {
System.out.println("ITEM ACCELERATION");
int current = getAcceleration();
int a = 0;

while (a < i.getRateAcceleration()) {
System.out.println("CURRENT ITEM ACCELERATION: " + getAcceleration());
acceleration(i.getRateAcceleration());

try {
Thread.sleep(sleepTime);
a++;
} catch (InterruptedException e) {
System.out.println(e);
}
}
System.out.println("FINISHED ITEM ACCELERATION: " + getAcceleration());
System.out.println("Slow down, you are going to fast. Be careful");
setAcceleration(current);
}

/**
* @return int
*/
public final int getAcceleration() {
return currentAcceleration;
}

/**
* @param ca
* int
*/
public void setAcceleration(final int ca) {
this.currentAcceleration += ca;
}

/**
* @param a
* int
*/
private void acceleration(final int a) {
this.currentAcceleration += a;
}

/**
*/
public final void basicAcceleration() {
System.out.println("Actual acceleration: " + getAcceleration());
this.currentAcceleration += accelarate;
System.out.println("New acceleration: " + getAcceleration());
}
}
