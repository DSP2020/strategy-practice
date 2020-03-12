package mx.iteso.behaviors;

import mx.iteso.behaviors.impl.acceleration.NormalAcceleration;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class NormalAccelerationTest {
    NormalAcceleration normalAcceleration;

    @Before
    public void setUp(){
        normalAcceleration= new NormalAcceleration();
    }

    @Test
    public void testAcceleration(){
        assertEquals("going normal", normalAcceleration.accelerate());
    }

}
