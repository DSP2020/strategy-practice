package mx.iteso.mariokart.items;

import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.implementation.SlowAcceleration;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * lightningStrike test class.
 */
public class LightningStrikeTest {
    LightningStrike lightningStrike;
    Acceleration slowAcceleration;

    @Before
    public void setUp() {
        lightningStrike = new LightningStrike();
        slowAcceleration = mock(SlowAcceleration.class);
    }

    @Test 
    public void testGetDuration() {
        assertEquals(6, lightningStrike.getDurationTime());
    }

    @Test
    public void testSetDuration() {
        lightningStrike.setDuration(2);
        assertEquals(2,lightningStrike.getDurationTime());
    }

    @Test
    public void testGetAcceleration() {
        when(slowAcceleration.accelerate()).thenReturn("Slow Acceleration");
        assertEquals("Slow Acceleration", lightningStrike.getAcceleration().accelerate());
    }

}