package mx.iteso.marioKart;

import mx.iteso.marioKart.items.Shell;
import mx.iteso.marioKart.items.Thunderbolt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThunderboltTest {
    Thunderbolt thunderbolt;

    @Before
    public void setUp(){ thunderbolt = new Thunderbolt(); }
    @Test
    public void testEfectAcceleration(){
        thunderbolt.setEfectAcceleration();
        assertEquals(-1,thunderbolt.getEfectAccelerationItem()); }
    @Test
    public void testTrueExceedLimit(){
        thunderbolt.setExceedLimitItem(true);
        assertTrue(thunderbolt.isExceedLimitItem());
    }
    @Test
    public void testTimeEfect(){
        thunderbolt.setTimeEfect();
        assertEquals(5,thunderbolt.getTimeEfectItem());
    }
    @Test
    public void testItemid(){
        thunderbolt.setItemSelector();
        assertEquals(1,thunderbolt.getItemSelector());
    }
}
