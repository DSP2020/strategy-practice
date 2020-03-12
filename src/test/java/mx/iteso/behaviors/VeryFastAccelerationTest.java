package mx.iteso.behaviors;

import mx.iteso.behaviors.impl.acceleration.FastAcceleration;
import mx.iteso.behaviors.impl.acceleration.VeryFastAcceleration;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VeryFastAccelerationTest {
    VeryFastAcceleration veryFastAcceleration;

    @Before
    public void setUp(){
        veryFastAcceleration = new VeryFastAcceleration();
    }

    @Test
    public void testAcceleration(){
        assertEquals("Accelerating very fast", veryFastAcceleration.accelerate());
    }

}
