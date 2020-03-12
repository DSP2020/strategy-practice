package mx.iteso.behaviors.drift;


import mx.iteso.behaviors.impl.drift.BadDrift;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BadDriftTest {
    BadDrift badDrift;
    @Before
    public void setUp(){
        badDrift= new BadDrift();
    }

    @Test
    public void testAcceleration(){
        assertEquals("Bad drift", badDrift.drift());
    }

}
