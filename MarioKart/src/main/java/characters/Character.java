package characters;

import acceleration.Acceleration;
import drifting.Drifting;
import item.Champinon;
import item.Estrella;
import item.Item;
import item.Moneda;

/**
 * @author hecto
 *
 */
public abstract class Character {
/**
*/
private final int totalTime = 20;

/**
*/
private final int itemTime = 10;

/**
*/
private final int itemID = 3;

/**
*/
private final int sleep = 500;

/**
*/
private Acceleration acceleration;

/**
*/
private Drifting drifting;

/**
* @param a
* Acceleration
*/
public final void setAccelerationType(final Acceleration a) {
this.acceleration = a;
}
/**
* @param d
* Drifting
*/
public final void setDrifting(final Drifting d) {
this.drifting = d;
}

/**
* @param i
* Item
*/
public final void accelerationItem(final Item i) {
if (this.acceleration != null) {
acceleration.itemAcceleration(i);
}
}
/**
*/
public final void accelerate() {
if (this.acceleration != null) {
acceleration.basicAcceleration();
}
}

/**
*/
public final void drift() {
if (this.drifting != null) {
drifting.drift(this);
}
}

/**
* @return int
*/
public final int getAcceleration() {
return acceleration.getAcceleration();
}

/**
* @param a
* int
*/
public final void setAcceleration(final int a) {
this.acceleration.setAcceleration(a);
}

/**
*/
public void startRunning() {
int time = 0;
int iTime = (int) (Math.random() * itemTime);

while (time < totalTime) {
try {
if (time == iTime) {
int itemid = (int) (Math.random() * itemID);
switch (itemid) {
case 0: this.accelerationItem(new Champinon());
break;
case 1: this.accelerationItem(new Estrella());
break;

default:  this.accelerationItem(new Moneda());
break;
}

}

this.accelerate();
Thread.sleep(sleep);
time++;
} catch (InterruptedException e) { }
}

this.drift();

}
}
