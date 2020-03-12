package mx.iteso.mariokart.items;

import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.implementation.FastAcceleration;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Star test class.
 */
public class StarTest {
    Star star;
    Acceleration fastAcceleration;

    @Before
    public void setUp() {
        star = new Star();
        fastAcceleration = mock(FastAcceleration.class);
    }

    @Test 
    public void testGetDuration() {
        assertEquals(6, star.getDurationTime());
    }

    @Test
    public void testSetDuration() {
        star.setDuration(2);
        assertEquals(2,star.getDurationTime());
    }

    @Test
    public void testGetAcceleration() {
        when(fastAcceleration.accelerate()).thenReturn("Fast Acceleration");
        assertEquals("Fast Acceleration", star.getAcceleration().accelerate());
    }

}