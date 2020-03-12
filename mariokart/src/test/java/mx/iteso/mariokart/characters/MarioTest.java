package mx.iteso.mariokart.characters;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.implementation.NormalAcceleration;
import mx.iteso.mariokart.behaviors.implementation.VeryFastAcceleration;
import mx.iteso.mariokart.items.Star;

/**
 * mario class test.
 */
public class MarioTest {
    Acceleration mockedAcceleration;
    Acceleration mockedFastAcceleration;
    Item mockedItem;
    Mario mario;

    @Before
    public void setUp() {
        mario = new Mario();
        mockedAcceleration = mock(NormalAcceleration.class);
        mockedItem = mock(Star.class);
        mockedFastAcceleration = mock(VeryFastAcceleration.class);
        mario.setAcceleration(mockedAcceleration);
        mario.setItem(mockedItem);
    }

    @Test
    public void testGetAcceleration() {
        when(mockedAcceleration.accelerate()).thenReturn("Normal Acceleration");
        assertEquals("Normal Acceleration", mario.getAcceleration().accelerate());
    }

    @Test
    public void testGetItem() {
        when(mockedItem.getAcceleration()).thenReturn(mockedFastAcceleration);
        when(mockedFastAcceleration.accelerate()).thenReturn("Very Fast Acceleration");
        assertEquals("Very Fast Acceleration", mario.getItem().getAcceleration().accelerate());
    }

    @Test
    public void testDrive() {
        assertEquals("I am Mario", mario.drive());
    }

    @Test
    public void testAccelerateWithoutItem() {
        when(mockedAcceleration.accelerate()).thenReturn("Normal Acceleration");
        mario.setItem(null);
        assertEquals("Normal Acceleration", mario.accelerate());
    }

    @Test
    public void testAccelerateWithItem() {
        when(mockedAcceleration.accelerate()).thenReturn("Normal Acceleration");
        when(mockedFastAcceleration.accelerate()).thenReturn("Very Fast Acceleration");
        when(mockedItem.getAcceleration()).thenReturn(mockedFastAcceleration);
        assertEquals("Very Fast Acceleration", mario.accelerate());
    }

    @Test
    public void testUseItem() {
        final String accelerationMessage = "Very Fast Acceleration";
        when(mockedAcceleration.accelerate()).thenReturn("Normal Acceleration");
        when(mockedFastAcceleration.accelerate()).thenReturn("Very Fast Acceleration");
        when(mockedItem.getAcceleration()).thenReturn(mockedFastAcceleration);
        when(mockedItem.getDurationTime()).thenReturn(1);
        assertEquals(accelerationMessage, mario.useItem());
    }

    @Test
    public void testUseNullItem() {
        when(mockedAcceleration.accelerate()).thenReturn("Normal Acceleration");
        when(mockedFastAcceleration.accelerate()).thenReturn("Very Fast Acceleration");
        when(mockedItem.getAcceleration()).thenReturn(mockedFastAcceleration);
        mario.setItem(null);
        assertEquals("Normal Acceleration", mario.useItem());
    }
}