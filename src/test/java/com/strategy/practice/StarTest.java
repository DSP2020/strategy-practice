package com.strategy.practice;

import com.strategy.practice.behaviors.imp.FastAcceleration;
import com.strategy.practice.items.Star;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StarTest {

    Star star;

    @Before
    public void setUp() {
        this.star = new Star();
    }

    @Test
    public void modifyTest() {
        assertTrue(star.modify() instanceof FastAcceleration);
    }
}
