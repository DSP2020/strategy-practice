package com.strategy.practice;

import com.strategy.practice.behaviors.imp.NormalDrift;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormalDriftTest {

    NormalDrift normalDrift;

    @Before
    public void setUp() {
        this.normalDrift = new NormalDrift();
    }

    @Test
    public void testDrift() {
        assertEquals("I'm normally drifting, nothing special :v", normalDrift.drift());
    }

}
