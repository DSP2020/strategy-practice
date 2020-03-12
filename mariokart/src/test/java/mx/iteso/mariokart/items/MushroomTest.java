package mx.iteso.mariokart.items;

import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.implementation.VeryFastAcceleration;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Mushroom test class.
 */
public class MushroomTest {
    Mushroom mushroom;
    Acceleration veryFastAcceleration;

    @Before
    public void setUp() {
        mushroom = new Mushroom();
        veryFastAcceleration = mock(VeryFastAcceleration.class);
    }

    @Test 
    public void testGetDuration() {
        assertEquals(6, mushroom.getDurationTime());
    }

    @Test
    public void testSetDuration() {
        mushroom.setDuration(2);
        assertEquals(2,mushroom.getDurationTime());
    }

    @Test
    public void testGetAcceleration() {
        when(veryFastAcceleration.accelerate()).thenReturn("Very Fast Acceleration");
        assertEquals("Very Fast Acceleration", mushroom.getAcceleration().accelerate());
    }

}