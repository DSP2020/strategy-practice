package test;

import characters.Bowser;
import characters.Luigi;
import characters.Mario;

/**
 * @author hecto
 *
 */
public final class Test {
/**
*/
private Test() {
}

/**
 * @param args
 * String[]
*/
public static void main(final String[] args) {
Luigi luigi = new Luigi();
luigi.startRunning();

Mario mario = new Mario();
mario.startRunning();

Bowser bowser = new Bowser();
bowser.startRunning();
}

}
