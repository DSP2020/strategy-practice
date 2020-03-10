package com.strategy.practice;

import com.strategy.practice.behaviors.imp.SlowAcceleration;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlowAccelerationTest {

    SlowAcceleration slowAcceleration;

    @Before
    public void setUp() {
        this.slowAcceleration = new SlowAcceleration();
    }

    @Test
    public void testAccelerate() {
        assertEquals("Help me, I'm slow :(", slowAcceleration.accelerate());
    }

}
