package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SlowAccelerationTest {
    SlowAcceleration slowAcceleration;

    @Before
    public void setup() {
        slowAcceleration = new SlowAcceleration();
    }

    @Test
    public void accelerateTest() {
        assertEquals("Broom", 
            slowAcceleration.accelerate());
    }
}