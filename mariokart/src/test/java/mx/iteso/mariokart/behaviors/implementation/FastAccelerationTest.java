package mx.iteso.mariokart.behaviors.implementation;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Fast Acceleration Test class.
 */
public class FastAccelerationTest {
    FastAcceleration fastAcceleration;

    @Before
    public void setUp(){
        fastAcceleration = new FastAcceleration();
    }

    @Test
    public void testMessage() {
        assertEquals("Fast Acceleration", fastAcceleration.accelerate());
    }
}