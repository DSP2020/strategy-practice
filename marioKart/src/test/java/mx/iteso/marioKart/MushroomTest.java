package mx.iteso.marioKart;

import mx.iteso.marioKart.items.Mushroom;
import mx.iteso.marioKart.items.Shell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MushroomTest {
    Mushroom mushroom;

    @Before
    public void setUp(){ mushroom = new Mushroom(); }
    @Test
    public void testEfectAcceleration(){
        mushroom.setEfectAcceleration();
        assertEquals(1,mushroom.getEfectAccelerationItem()); }
    @Test
    public void testTrueExceedLimit(){
        mushroom.setExceedLimitItem(true);
        assertTrue(mushroom.isExceedLimitItem());
    }
    @Test
    public void testTimeEfect(){
        mushroom.setTimeEfect();
        assertEquals(3,mushroom.getTimeEfectItem());
    }
    @Test
    public void testItemid(){
        mushroom.setItemSelector();
        assertEquals(2,mushroom.getItemSelector());
    }
}
