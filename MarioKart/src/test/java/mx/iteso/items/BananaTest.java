package mx.iteso.items;

import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.impl.SlowAcceleration;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BananaTest {
    Banana banana;
    Acceleration slowAcceleration;

    @Before
    public void setUp(){
        banana = new Banana();
        slowAcceleration = mock(SlowAcceleration.class);
    }

    @Test
    public void testGetDuration(){
        assertEquals(1, banana.getDuration());
    }

    public void testSetDuration(){
        banana.setDuration(10);
        assertEquals(10,banana.getDuration());
    }

    public void testGetAcceleration(){
        when(slowAcceleration.accelerate()).thenReturn("going slooooow");
        assertEquals("going slooooow",banana.getAcceleration().accelerate());
    }
}
