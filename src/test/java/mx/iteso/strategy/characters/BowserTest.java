package mx.iteso.strategy.characters;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import mx.iteso.strategy.Item;
import mx.iteso.strategy.behaviors.IAcceleration;
import mx.iteso.strategy.behaviors.impl.SlowAcceleration;
import mx.iteso.strategy.behaviors.impl.SuperFastAcceleration;
import mx.iteso.strategy.items.Mushroom;

/**
 * Bowser class test.
 */
public class BowserTest {
    IAcceleration mockedIAcceleration;
    IAcceleration mockedSuperFastAcceleration;
    Item mockedItem;
    Bowser bowser;

    @Before
    public void setUp() {
        bowser = new Bowser();
        mockedIAcceleration = mock(SlowAcceleration.class);
        mockedItem = mock(Mushroom.class);
        mockedSuperFastAcceleration = mock(SuperFastAcceleration.class);
        bowser.setAcceleration(mockedIAcceleration);
        bowser.setItem(mockedItem);
    }

    @Test
    public void testGetAcceleration() {
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom");
        assertEquals("Zoom", bowser.getAcceleration().accelerate());
    }

    @Test
    public void testGetItem() {
        when(mockedItem.getAcceleration()).thenReturn(mockedSuperFastAcceleration);
        when(mockedSuperFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        assertEquals("Zoom Zoom Zoom Zoom", bowser.getItem().getAcceleration().accelerate());
    }

    @Test
    public void testDrive() {
        assertEquals("I'm Bowser", bowser.drive());
    }

    @Test
    public void testAccelerateWithoutItem() {
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom");
        bowser.setItem(null);
        assertEquals("Zoom", bowser.accelerate());
    }

    @Test
    public void testAccelerateWithItem() {
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom");
        when(mockedSuperFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        when(mockedItem.getAcceleration()).thenReturn(mockedSuperFastAcceleration);
        assertEquals("Zoom Zoom Zoom Zoom", bowser.accelerate());
    }

    @Test
    public void testUseItem() {
        final String accelerationMessage = "Zoom Zoom Zoom Zoom";
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom");
        when(mockedSuperFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        when(mockedItem.getAcceleration()).thenReturn(mockedSuperFastAcceleration);
        when(mockedItem.getDuration()).thenReturn(1);
        assertEquals(accelerationMessage, bowser.useItem());
    }

    @Test
    public void testUseNullItem() {
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom");
        when(mockedSuperFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        when(mockedItem.getAcceleration()).thenReturn(mockedSuperFastAcceleration);
        bowser.setItem(null);
        assertEquals("", bowser.useItem());
    }
}