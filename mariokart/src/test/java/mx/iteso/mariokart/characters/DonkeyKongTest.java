package mx.iteso.mariokart.characters;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.implementation.NormalAcceleration;
import mx.iteso.mariokart.behaviors.implementation.VeryFastAcceleration;
import mx.iteso.mariokart.items.Mushroom;

/**
 * DonkeyKong class test.
 */
public class DonkeyKongTest {
    Acceleration mockedAcceleration;
    Acceleration mockedVeryFastAcceleration;
    Item mockedItem;
    DonkeyKong donkeyKong;

    @Before
    public void setUp() {
        donkeyKong = new DonkeyKong();
        mockedAcceleration = mock(NormalAcceleration.class);
        mockedItem = mock(Mushroom.class);
        mockedVeryFastAcceleration = mock(VeryFastAcceleration.class);
        donkeyKong.setAcceleration(mockedAcceleration);
        donkeyKong.setItem(mockedItem);
    }

    @Test
    public void testGetAcceleration() {
        when(mockedAcceleration.accelerate()).thenReturn("Normal Acceleration");
        assertEquals("Normal Acceleration", donkeyKong.getAcceleration().accelerate());
    }

    @Test
    public void testGetItem() {
        when(mockedItem.getAcceleration()).thenReturn(mockedVeryFastAcceleration);
        when(mockedVeryFastAcceleration.accelerate()).thenReturn("Very Fast Acceleration");
        assertEquals("Very Fast Acceleration", donkeyKong.getItem().getAcceleration().accelerate());
    }

    @Test
    public void testDrive() {
        assertEquals("I am Donkey Kong", donkeyKong.drive());
    }

    @Test
    public void testAccelerateWithoutItem() {
        when(mockedAcceleration.accelerate()).thenReturn("Normal Acceleration");
        donkeyKong.setItem(null);
        assertEquals("Normal Acceleration", donkeyKong.accelerate());
    }

    @Test
    public void testAccelerateWithItem() {
        when(mockedAcceleration.accelerate()).thenReturn("Normal Acceleration");
        when(mockedVeryFastAcceleration.accelerate()).thenReturn("Very Fast Acceleration");
        when(mockedItem.getAcceleration()).thenReturn(mockedVeryFastAcceleration);
        assertEquals("Very Fast Acceleration", donkeyKong.accelerate());
    }

    @Test
    public void testUseItem() {
        final String accelerationMessage = "Very Fast Acceleration";
        when(mockedAcceleration.accelerate()).thenReturn("Normal Acceleration");
        when(mockedVeryFastAcceleration.accelerate()).thenReturn("Very Fast Acceleration");
        when(mockedItem.getAcceleration()).thenReturn(mockedVeryFastAcceleration);
        when(mockedItem.getDurationTime()).thenReturn(1);
        assertEquals(accelerationMessage, donkeyKong.useItem());
    }

    @Test
    public void testUseNullItem() {
        when(mockedAcceleration.accelerate()).thenReturn("Normal Acceleration");
        when(mockedVeryFastAcceleration.accelerate()).thenReturn("Very Fast Acceleration");
        when(mockedItem.getAcceleration()).thenReturn(mockedVeryFastAcceleration);
        donkeyKong.setItem(null);
        assertEquals("Normal Acceleration", donkeyKong.useItem());
    }
}