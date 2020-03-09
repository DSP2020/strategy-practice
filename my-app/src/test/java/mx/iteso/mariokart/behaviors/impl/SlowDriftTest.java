package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SlowDriftTest {
    SlowDrift slowDrift;

    @Before
    public void setup() {
        slowDrift = new SlowDrift();
    }

    @Test
    public void accelerateTest() {
        assertEquals("Slow drift", 
            slowDrift.drift());
    }
}