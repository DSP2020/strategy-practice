package com.strategy.practice;

import com.strategy.practice.behaviors.imp.ShortDrift;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortDriftTest {

    ShortDrift shortDrift;

    @Before
    public void setUp() {
        this.shortDrift = new ShortDrift();
    }

    @Test
    public void testDrift() {
        assertEquals("I'm heavy and slow, I barely drift >:(", shortDrift.drift());
    }

}
