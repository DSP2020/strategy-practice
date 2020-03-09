package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class FastestAccelerationTest {
    FastestAcceleration fastestAcceleration;

    @Before
    public void setup() {
        fastestAcceleration = new FastestAcceleration();
    }

    @Test
    public void accelerateTest() {
        assertEquals("Broom broom broom broom", 
            fastestAcceleration.accelerate());
    }
}