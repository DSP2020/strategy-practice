package mx.iteso.mariokart.behaviors.implementation;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Very Fast Acceleration Test class.
 */
public class VeryFastAccelerationTest {
    VeryFastAcceleration veryFastAcceleration;

    @Before
    public void setUp(){
        veryFastAcceleration = new VeryFastAcceleration();
    }

    @Test
    public void testMessage() {
        assertEquals("Very Fast Acceleration", veryFastAcceleration.accelerate());
    }
}