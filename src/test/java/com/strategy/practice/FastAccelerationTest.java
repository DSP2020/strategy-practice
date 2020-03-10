package com.strategy.practice;

import com.strategy.practice.behaviors.imp.FastAcceleration;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FastAccelerationTest {

    FastAcceleration fastAcceleration;

    @Before
    public void setUp() {
        this.fastAcceleration = new FastAcceleration();
    }

    @Test
    public void testAccelerate() {
        assertEquals("I´m very very very fast", fastAcceleration.accelerate());
    }

}
