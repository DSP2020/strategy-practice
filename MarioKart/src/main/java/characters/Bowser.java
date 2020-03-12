package characters;

import acceleration.Slow;
import drifting.High;

/**
 * @author hecto
 *
 */
public class Bowser extends Character {
/**
*/
public Bowser() {
setAccelerationType(new Slow());
setDrifting(new High());
}

/**
*/
public final void startRunning() {
System.out.println("Hello, it's me Bowser:");
System.out.println("I'll start the race");
super.startRunning();
System.out.println("I finished the race my acceleration was: "
+ this.getAcceleration());
}
}
