package mx.iteso.marioKart;

import mx.iteso.marioKart.items.Shell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShellTest {
    Shell shell;

    @Before
    public void setUp(){ shell = new Shell(); }
    @Test
    public void testEfectAcceleration(){
        shell.setEfectAcceleration();
        assertEquals(-3,shell.getEfectAccelerationItem()); }
    @Test
    public void testTrueExceedLimit(){
        shell.setExceedLimitItem(true);
        assertTrue(shell.isExceedLimitItem());
    }
    @Test
    public void testTimeEfect(){
        shell.setTimeEfect();
        assertEquals(3,shell.getTimeEfectItem());
    }
    @Test
    public void testItemid(){
        shell.setItemSelector();
        assertEquals(3,shell.getItemSelector());
    }
}
