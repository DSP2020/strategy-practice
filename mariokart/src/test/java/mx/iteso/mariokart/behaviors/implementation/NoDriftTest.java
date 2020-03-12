package mx.iteso.mariokart.behaviors.implementation;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * noDrift Test class.
 */
public class NoDriftTest {
    NoDrift noDrift;

    @Before
    public void setUp(){
        noDrift = new NoDrift();
    }

    @Test
    public void testMessage() {
        assertEquals("You drive like a baby", noDrift.drift());
    }
}