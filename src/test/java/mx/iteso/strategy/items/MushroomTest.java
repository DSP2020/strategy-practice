package mx.iteso.strategy.items;

import mx.iteso.strategy.behaviors.IAcceleration;
import mx.iteso.strategy.behaviors.impl.SuperFastAcceleration;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Mushroom test class.
 */
public class MushroomTest {
    Mushroom mushroom;
    IAcceleration superFastAcceleration;

    @Before
    public void setUp() {
        mushroom = new Mushroom();
        superFastAcceleration = mock(SuperFastAcceleration.class);
    }

    @Test 
    public void testGetDuration() {
        assertEquals(1, mushroom.getDuration());
    }

    @Test
    public void testSetDuration() {
        mushroom.setDuration(2);
        assertEquals(2,mushroom.getDuration());
    }

    @Test
    public void testGetAcceleration() {
        when(superFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        assertEquals("Zoom Zoom Zoom Zoom", mushroom.getAcceleration().accelerate());
    }

}