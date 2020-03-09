package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class FastAccelerationTest {
    FastAcceleration fastAcceleration;

    @Before
    public void setup() {
        fastAcceleration = new FastAcceleration();
    }

    @Test
    public void accelerateTest() {
        assertEquals("Broom broom", 
            fastAcceleration.accelerate());
    }
}