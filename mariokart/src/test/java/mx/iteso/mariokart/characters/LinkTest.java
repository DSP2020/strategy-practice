package mx.iteso.mariokart.characters;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.implementation.FastAcceleration;
import mx.iteso.mariokart.behaviors.implementation.SlowAcceleration;
import mx.iteso.mariokart.items.LightningStrike;

/**
 * link class test.
 */
public class LinkTest {
    Acceleration mockedAcceleration;
    Acceleration mockedSlowAcceleration;
    Item mockedItem;
    Link link;

    @Before
    public void setUp() {
        link = new Link();
        mockedAcceleration = mock(FastAcceleration.class);
        mockedItem = mock(LightningStrike.class);
        mockedSlowAcceleration = mock(SlowAcceleration.class);
        link.setAcceleration(mockedAcceleration);
        link.setItem(mockedItem);
    }

    @Test
    public void testGetAcceleration() {
        when(mockedAcceleration.accelerate()).thenReturn("Fast Acceleration");
        assertEquals("Fast Acceleration", link.getAcceleration().accelerate());
    }

    @Test
    public void testGetItem() {
        when(mockedItem.getAcceleration()).thenReturn(mockedSlowAcceleration);
        when(mockedSlowAcceleration.accelerate()).thenReturn("Slow Acceleration");
        assertEquals("Slow Acceleration", link.getItem().getAcceleration().accelerate());
    }

    @Test
    public void testDrive() {
        assertEquals("I am Link", link.drive());
    }

    @Test
    public void testAccelerateWithoutItem() {
        when(mockedAcceleration.accelerate()).thenReturn("Fast Acceleration");
        link.setItem(null);
        assertEquals("Fast Acceleration", link.accelerate());
    }

    @Test
    public void testAccelerateWithItem() {
        when(mockedAcceleration.accelerate()).thenReturn("Fast Acceleration");
        when(mockedSlowAcceleration.accelerate()).thenReturn("Slow Acceleration");
        when(mockedItem.getAcceleration()).thenReturn(mockedSlowAcceleration);
        assertEquals("Slow Acceleration", link.accelerate());
    }

    @Test
    public void testUseItem() {
        final String accelerationMessage = "Slow Acceleration";
        when(mockedAcceleration.accelerate()).thenReturn("Fast Acceleration");
        when(mockedSlowAcceleration.accelerate()).thenReturn("Slow Acceleration");
        when(mockedItem.getAcceleration()).thenReturn(mockedSlowAcceleration);
        when(mockedItem.getDurationTime()).thenReturn(1);
        assertEquals(accelerationMessage, link.useItem());
    }

    @Test
    public void testUseNullItem() {
        when(mockedAcceleration.accelerate()).thenReturn("Fast Acceleration");
        when(mockedSlowAcceleration.accelerate()).thenReturn("Slow Acceleration");
        when(mockedItem.getAcceleration()).thenReturn(mockedSlowAcceleration);
        link.setItem(null);
        assertEquals("Fast Acceleration", link.useItem());
    }
}