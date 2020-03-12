package characters;

import acceleration.Normal;

/**
 * @author hecto
 *
 */
public class Luigi extends Character {

/**
*/
public Luigi() {
setAccelerationType(new Normal());
setDrifting(new drifting.Normal());
}

/**
*/
public final void startRunning() {
System.out.println("Hello, it's me Luigui:");
System.out.println("I'll start the race");
super.startRunning();
System.out.println("I finished the race my acceleration was: "
+ this.getAcceleration());
}
}
