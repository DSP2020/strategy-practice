package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * SlowAcceleraton Test class.
 */
public class FastTest {
    FastAcceleration fastAcceleration;

    @Before
    public void setUp(){
        fastAcceleration = new FastAcceleration();
    }

    @Test
    public void testMessage() {
        assertEquals("Zoom Zoom Zoom", fastAcceleration.accelerate());
    }
}