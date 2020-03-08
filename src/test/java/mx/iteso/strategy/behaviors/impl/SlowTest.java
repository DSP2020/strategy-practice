package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * SlowAcceleraton Test class.
 */
public class SlowTest {
    SlowAcceleration slowAcceleration;

    @Before
    public void setUp(){
        slowAcceleration = new SlowAcceleration();
    }

    @Test
    public void testMessage() {
        assertEquals("Zoom", slowAcceleration.accelerate());
    }
}