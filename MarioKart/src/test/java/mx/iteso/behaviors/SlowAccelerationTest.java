package mx.iteso.behaviors;

import mx.iteso.behaviors.impl.SlowAcceleration;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SlowAccelerationTest {
    SlowAcceleration slowAcceleration;

    @Before
    public void setUp(){
        slowAcceleration= new SlowAcceleration();
    }

    @Test
    public void testAcceleration(){
        assertEquals("going slooooow", slowAcceleration.accelerate());
    }

}
