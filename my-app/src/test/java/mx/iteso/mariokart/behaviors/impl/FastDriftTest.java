package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class FastDriftTest {
    FastDrift fastDrift;

    @Before
    public void setup() {
        fastDrift = new FastDrift();
    }

    @Test
    public void accelerateTest() {
        assertEquals("Fast drift", 
            fastDrift.drift());
    }
}