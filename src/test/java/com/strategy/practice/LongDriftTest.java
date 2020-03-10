package com.strategy.practice;

import com.strategy.practice.behaviors.imp.LongDrift;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongDriftTest {

    LongDrift longDrift;

    @Before
    public void setUp() {
        this.longDrift = new LongDrift();
    }

    @Test
    public void testDrift() {
        assertEquals("I'm really drifting, so long, so fast, so cool :B", longDrift.drift());
    }

}
