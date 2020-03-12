package mx.iteso.mariokart.behaviors.implementation;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * SlowAcceleraton Test class.
 */
public class SlowAccelerationTest {
    SlowAcceleration slowAcceleration;

    @Before
    public void setUp(){
        slowAcceleration = new SlowAcceleration();
    }

    @Test
    public void testMessage() {
        assertEquals("Slow Acceleration", slowAcceleration.accelerate());
    }
}