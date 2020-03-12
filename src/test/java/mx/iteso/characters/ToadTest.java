package mx.iteso.characters;

import mx.iteso.Item;
import mx.iteso.MarioKartCharacter;
import mx.iteso.behaviors.Acceleration;
import mx.iteso.behaviors.impl.acceleration.NormalAcceleration;
import mx.iteso.behaviors.impl.acceleration.SlowAcceleration;
import mx.iteso.items.Banana;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ToadTest {
    Acceleration normalAcceleration;
    Acceleration slowAcceleration;
    Item item;
    MarioKartCharacter toad;

    @Before
    public void setUp(){
        toad = new Toad();
        normalAcceleration =mock(NormalAcceleration.class);
        slowAcceleration = mock(SlowAcceleration.class);
        item = mock(Banana.class);
        toad.setAcceleration(normalAcceleration);
        toad.setItem(item);
    }

    @Test
    public void testGetAcceleration() {
        when(normalAcceleration.accelerate()).thenReturn("Accelerating normally");
        assertEquals("Accelerating normally", toad.getAcceleration().accelerate());
    }

    @Test
    public void testGetItem(){
        when(item.getAcceleration()).thenReturn(slowAcceleration);
        when(slowAcceleration.accelerate()).thenReturn("Accelerating slowly");
        assertEquals("Accelerating slowly", toad.getItem().getAcceleration().accelerate());
    }

    @Test
    public void testDrive(){
        assertEquals("Toad driving", toad.drive());
    }

    @Test
    public void testAccelerate(){
        when(normalAcceleration.accelerate()).thenReturn("Accelerating normally");
        when(slowAcceleration.accelerate()).thenReturn("Accelerating slowly");
        when(item.getAcceleration()).thenReturn(slowAcceleration);
        assertEquals("Accelerating slowly", toad.accelerate());
    }

    @Test
    public void testUseItem(){
        when(normalAcceleration.accelerate()).thenReturn("Accelerating normally");
        when(slowAcceleration.accelerate()).thenReturn("Accelerating slowly");
        when(item.getAcceleration()).thenReturn(slowAcceleration);
        when(item.getDuration()).thenReturn(1);
        assertEquals("Accelerating slowly", toad.useItem());
        assertEquals(1,item.getDuration());
    }

}
