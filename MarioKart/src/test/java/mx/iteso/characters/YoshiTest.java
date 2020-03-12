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

public class YoshiTest {
    Acceleration normalAcceleration;
    Acceleration slowAcceleration;
    Item item;
    MarioKartCharacter yoshi;

    @Before
    public void setUp(){
        yoshi= new Yoshi();
        normalAcceleration =mock(NormalAcceleration.class);
        slowAcceleration = mock(SlowAcceleration.class);
        item = mock(Banana.class);
        yoshi.setAcceleration(normalAcceleration);
        yoshi.setItem(item);
    }

    @Test
    public void testGetAcceleration() {
        when(normalAcceleration.accelerate()).thenReturn("going normal");
        assertEquals("going normal",yoshi.getAcceleration().accelerate());
    }

    @Test
    public void testGetItem(){
        when(item.getAcceleration()).thenReturn(slowAcceleration);
        when(slowAcceleration.accelerate()).thenReturn("going slooooow");
        assertEquals("going slooooow",yoshi.getItem().getAcceleration().accelerate());
    }

    @Test
    public void testDrive(){
        assertEquals("It's me Yoshi", yoshi.drive());
    }

    @Test
    public void testAccelerate(){
        when(normalAcceleration.accelerate()).thenReturn("going normal");
        when(slowAcceleration.accelerate()).thenReturn("going slooooow");
        when(item.getAcceleration()).thenReturn(slowAcceleration);
        assertEquals("going slooooow", yoshi.accelerate());
    }

    @Test
    public void testUseItem(){
        when(normalAcceleration.accelerate()).thenReturn("going normal");
        when(slowAcceleration.accelerate()).thenReturn("going slooooow");
        when(item.getAcceleration()).thenReturn(slowAcceleration);
        when(item.getDuration()).thenReturn(1);
        assertEquals("going slooooow", yoshi.useItem());
        assertEquals(1,item.getDuration());
    }

}
