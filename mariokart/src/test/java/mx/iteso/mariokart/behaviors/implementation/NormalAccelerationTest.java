package mx.iteso.mariokart.behaviors.implementation;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Normal Acceleraton Test class.
 */
public class NormalAccelerationTest {
    NormalAcceleration normalAcceleration;

    @Before
    public void setUp(){
        normalAcceleration = new NormalAcceleration();
    }

    @Test
    public void testMessage() {
        assertEquals("Normal Acceleration", normalAcceleration.accelerate());
    }
}