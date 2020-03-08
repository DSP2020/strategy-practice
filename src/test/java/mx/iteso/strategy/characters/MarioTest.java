package mx.iteso.strategy.characters;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import mx.iteso.strategy.Item;
import mx.iteso.strategy.behaviors.IAcceleration;
import mx.iteso.strategy.behaviors.impl.NormalAcceleration;
import mx.iteso.strategy.behaviors.impl.SuperFastAcceleration;
import mx.iteso.strategy.items.Mushroom;

/**
 * Mario class test.
 */
public class MarioTest {
    IAcceleration mockedIAcceleration;
    IAcceleration mockedSuperFastAcceleration;
    Item mockedItem;
    Mario mario;

    @Before
    public void setUp() {
        mario = new Mario();
        mockedIAcceleration = mock(NormalAcceleration.class);
        mockedItem = mock(Mushroom.class);
        mockedSuperFastAcceleration = mock(SuperFastAcceleration.class);
        mario.setAcceleration(mockedIAcceleration);
        mario.setItem(mockedItem);
    }

    @Test
    public void testGetAcceleration() {
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom Zoom");
        assertEquals("Zoom Zoom", mario.getAcceleration().accelerate());
    }

    @Test
    public void testGetItem() {
        when(mockedItem.getAcceleration()).thenReturn(mockedSuperFastAcceleration);
        when(mockedSuperFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        assertEquals("Zoom Zoom Zoom Zoom", mario.getItem().getAcceleration().accelerate());
    }

    @Test
    public void testDrive() {
        assertEquals("I'm Mario", mario.drive());
    }

    @Test
    public void testAccelerateWithoutItem() {
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom Zoom");
        mario.setItem(null);
        assertEquals("Zoom Zoom", mario.accelerate());
    }

    @Test
    public void testAccelerateWithItem() {
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom Zoom");
        when(mockedSuperFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        when(mockedItem.getAcceleration()).thenReturn(mockedSuperFastAcceleration);
        assertEquals("Zoom Zoom Zoom Zoom", mario.accelerate());
    }

    @Test
    public void testUseItem() {
        final String accelerationMessage = "Zoom Zoom Zoom Zoom";
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom");
        when(mockedSuperFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        when(mockedItem.getAcceleration()).thenReturn(mockedSuperFastAcceleration);
        when(mockedItem.getDuration()).thenReturn(1);
        assertEquals(accelerationMessage, mario.useItem());
    }

    @Test
    public void testUseNullItem() {
        when(mockedIAcceleration.accelerate()).thenReturn("Zoom Zoom");
        when(mockedSuperFastAcceleration.accelerate()).thenReturn("Zoom Zoom Zoom Zoom");
        when(mockedItem.getAcceleration()).thenReturn(mockedSuperFastAcceleration);
        mario.setItem(null);
        assertEquals("", mario.useItem());
    }
}