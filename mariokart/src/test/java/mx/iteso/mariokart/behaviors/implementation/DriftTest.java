package mx.iteso.mariokart.behaviors.implementation;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Fast Acceleration Test class.
 */
public class DriftTest {
    Drift drift;

    @Before
    public void setUp(){
        drift = new Drift();
    }

    @Test
    public void testMessage() {
        assertEquals("You drive like a men!", drift.drift());
    }
}