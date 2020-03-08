package mx.iteso.strategy.characters;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import mx.iteso.strategy.Item;
import mx.iteso.strategy.behaviors.IAcceleration;
import mx.iteso.strategy.behaviors.impl.FastAcceleration;
import mx.iteso.strategy.behaviors.impl.SuperFastAcceleration;
import mx.iteso.strategy.items.Mushroom;

/**
 * Yoshi class test.
 */
public class YoshiTest {
    IAcceleration mockedIAcceleration;
    IAcceleration mockedSuperFastAcceleration;
    Item mockedItem;
    Yoshi yoshi;

    @Before
    public void setUp() {
        yoshi = new Yoshi();
        mockedIAcceleration = mock(FastAcceleration.class);
        mockedItem = mock(Mushroom.class);
        mockedSuperFastAcceleration = mock(SuperFastAcceleration.class);
        yoshi.setAcceleration(mockedIAcceleration);
        yoshi.setItem(mockedItem);
    }

    @Test
    public void testGetAcceleration() {
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom");
        assertEquals("Zoom Zoom Zoom", yoshi.getAcceleration().accelerate());
    }

    @Test
    public void testGetItem() {
        when(mockedItem.getAcceleration()).thenReturn(mockedSuperFastAcceleration);
        when(mockedSuperFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        assertEquals("Zoom Zoom Zoom Zoom", yoshi.getItem().getAcceleration().accelerate());
    }

    @Test
    public void testDrive() {
        assertEquals("I'm Yoshi", yoshi.drive());
    }

    @Test
    public void testAccelerateWithoutItem() {
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom");
        yoshi.setItem(null);
        assertEquals("Zoom Zoom Zoom", yoshi.accelerate());
    }

    @Test
    public void testAccelerateWithItem() {
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom");
        when(mockedSuperFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        when(mockedItem.getAcceleration()).thenReturn(mockedSuperFastAcceleration);
        assertEquals("Zoom Zoom Zoom Zoom", yoshi.accelerate());
    }

    @Test
    public void testUseItem() {
        final String accelerationMessage = "Zoom Zoom Zoom Zoom";
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom");
        when(mockedSuperFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        when(mockedItem.getAcceleration()).thenReturn(mockedSuperFastAcceleration);
        when(mockedItem.getDuration()).thenReturn(1);
        assertEquals(accelerationMessage, yoshi.useItem());
    }

    @Test
    public void testUseNullItem() {
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom");
        when(mockedSuperFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        when(mockedItem.getAcceleration()).thenReturn(mockedSuperFastAcceleration);
        yoshi.setItem(null);
        assertEquals("", yoshi.useItem());
    }
}