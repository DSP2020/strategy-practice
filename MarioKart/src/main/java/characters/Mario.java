package characters;

import acceleration.Fast;
import drifting.Low;

/**
 * @author hecto
 *
 */
public class Mario extends Character {

/**
*/
public Mario() {
setAccelerationType(new Fast());
setDrifting(new Low());
}

/**
*/
public final void startRunning() {
System.out.println("Hello, it's me Mario:");
System.out.println("I'll start the race");
super.startRunning();
System.out.println("I finished the race my acceleration was: "
+ this.getAcceleration());
}

}
