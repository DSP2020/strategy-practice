package com.strategy.practice;

import com.strategy.practice.behaviors.imp.NormalAcceleration;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormalAccelerationTest {

    NormalAcceleration normalAcceleration;

    @Before
    public void setUp() {
        this.normalAcceleration = new NormalAcceleration();
    }

    @Test
    public void testAccelerate() {
        assertEquals("I´m running normal", normalAcceleration.accelerate());
    }

}
