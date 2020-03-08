package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * SuperFastAcceleration Test class.
 */
public class SuperFastTest {
    SuperFastAcceleration superFastAcceleration;

    @Before
    public void setUp(){
        superFastAcceleration = new SuperFastAcceleration();
    }

    @Test
    public void testMessage() {
        assertEquals("Zoom Zoom Zoom Zoom", superFastAcceleration.accelerate());
    }
}