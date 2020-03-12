package mx.iteso.behaviors;

import mx.iteso.behaviors.impl.acceleration.FastAcceleration;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class FastAccelerationTest {
    FastAcceleration fastAcceleration;

    @Before
    public void setUp(){
        fastAcceleration= new FastAcceleration();
    }

    @Test
    public void testAcceleration(){
        assertEquals("going fasttt", fastAcceleration.accelerate());
    }

}
