package mx.iteso.characters;

import mx.iteso.Item;
import mx.iteso.MarioKartCharacter;
import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.impl.NormalAcceleration;
import mx.iteso.behaviors.impl.SlowAcceleration;
import mx.iteso.items.Banana;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PeachTest {
    Acceleration normalAcceleration;
    Acceleration slowAcceleration;
    Item item;
    MarioKartCharacter peach;

    @Before
    public void setUp(){
        peach= new Peach();
        normalAcceleration =mock(NormalAcceleration.class);
        slowAcceleration = mock(SlowAcceleration.class);
        item = mock(Banana.class);
        peach.setAcceleration(normalAcceleration);
        peach.setItem(item);
    }

    @Test
    public void testGetAcceleration() {
        when(normalAcceleration.accelerate()).thenReturn("going normal");
        assertEquals("going normal",peach.getAcceleration().accelerate());
    }

    @Test
    public void testGetItem(){
        when(item.getAcceleration()).thenReturn(slowAcceleration);
        when(slowAcceleration.accelerate()).thenReturn("going slooooow");
        assertEquals("going slooooow",peach.getItem().getAcceleration().accelerate());
    }

    @Test
    public void testDrive(){
        assertEquals("It's me Peach", peach.drive());
    }

    @Test
    public void testAccelerate(){
        when(normalAcceleration.accelerate()).thenReturn("going normal");
        when(slowAcceleration.accelerate()).thenReturn("going slooooow");
        when(item.getAcceleration()).thenReturn(slowAcceleration);
        assertEquals("going slooooow", peach.accelerate());
    }

    @Test
    public void testUseItem(){
        when(normalAcceleration.accelerate()).thenReturn("going normal");
        when(slowAcceleration.accelerate()).thenReturn("going slooooow");
        when(item.getAcceleration()).thenReturn(slowAcceleration);
        when(item.getDuration()).thenReturn(1);
        assertEquals("going slooooow", peach.useItem());
        assertEquals(1,item.getDuration());
    }

}
