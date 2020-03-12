package mx.iteso.items;

import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.impl.acceleration.FastAcceleration;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MushroomTest {
    Mushroom mushroom;
    Acceleration fastAcceleration;

    @Before
    public void setUp(){
        mushroom = new Mushroom();
        fastAcceleration = mock(FastAcceleration.class);
    }

    @Test
    public void testGetDuration(){
        assertEquals(1, mushroom.getDuration());
    }

    public void testSetDuration(){
        mushroom.setDuration(10);
        assertEquals(10,mushroom.getDuration());
    }

    public void testGetAcceleration(){
        when(fastAcceleration.accelerate()).thenReturn("Accelerating very fast");
        assertEquals("Accelerating very fast",mushroom.getAcceleration().accelerate());
    }
}
