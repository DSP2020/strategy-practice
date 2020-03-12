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

public class LuigiTest {
    Acceleration normalAcceleration;
    Acceleration slowAcceleration;
    Item item;
    MarioKartCharacter luigi;

    @Before
    public void setUp(){
        luigi = new Luigi();
        normalAcceleration =mock(NormalAcceleration.class);
        slowAcceleration = mock(SlowAcceleration.class);
        item = mock(Banana.class);
        luigi.setAcceleration(normalAcceleration);
        luigi.setItem(item);
    }

    @Test
    public void testGetAcceleration() {
        when(normalAcceleration.accelerate()).thenReturn("Accelerating normally");
        assertEquals("Accelerating normally", luigi.getAcceleration().accelerate());
    }

    @Test
    public void testGetItem(){
        when(item.getAcceleration()).thenReturn(slowAcceleration);
        when(slowAcceleration.accelerate()).thenReturn("Accelerating slowly");
        assertEquals("Accelerating slowly", luigi.getItem().getAcceleration().accelerate());
    }

    @Test
    public void testDrive(){
        assertEquals("Luigi driving", luigi.drive());
    }

    @Test
    public void testAccelerate(){
        when(normalAcceleration.accelerate()).thenReturn("Accelerating normally");
        when(slowAcceleration.accelerate()).thenReturn("Accelerating slowly");
        when(item.getAcceleration()).thenReturn(slowAcceleration);
        assertEquals("Accelerating slowly", luigi.accelerate());
    }

    @Test
    public void testUseItem(){
        when(normalAcceleration.accelerate()).thenReturn("Accelerating normally");
        when(slowAcceleration.accelerate()).thenReturn("Accelerating slowly");
        when(item.getAcceleration()).thenReturn(slowAcceleration);
        when(item.getDuration()).thenReturn(1);
        assertEquals("Accelerating slowly", luigi.useItem());
        assertEquals(1,item.getDuration());
    }

}
