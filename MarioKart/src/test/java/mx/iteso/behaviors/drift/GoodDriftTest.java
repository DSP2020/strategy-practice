package mx.iteso.behaviors.drift;

import mx.iteso.behaviors.impl.drift.GoodDrift;
import mx.iteso.behaviors.impl.drift.NormalDrift;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class GoodDriftTest {
    GoodDrift goodDrift;
    @Before
    public void setUp(){
        goodDrift= new GoodDrift();
    }

    @Test
    public void testAcceleration(){
        assertEquals("Good drift", goodDrift.drift());
    }

}
