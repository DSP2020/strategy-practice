package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * SlowAcceleraton Test class.
 */
public class NormalTest {
    NormalAcceleration normalAcceleration;

    @Before
    public void setUp(){
        normalAcceleration = new NormalAcceleration();
    }

    @Test
    public void testMessage() {
        assertEquals("Zoom Zoom", normalAcceleration.accelerate());
    }
}