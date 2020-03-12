package mx.iteso.behaviors.drift;

import mx.iteso.behaviors.impl.drift.NormalDrift;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class NormalDriftTest {
    NormalDrift normalDrift;
    @Before
    public void setUp(){
        normalDrift= new NormalDrift();
    }

    @Test
    public void testAcceleration(){
        assertEquals("Normal drift", normalDrift.drift());
    }

}
