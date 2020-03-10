package com.strategy.practice;

import com.strategy.practice.behaviors.imp.SlowAcceleration;
import com.strategy.practice.items.Ray;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RayTest {

    Ray ray;

    @Before
    public void setUp() {
        this.ray = new Ray();
    }

    @Test
    public void modifyTest() {
        assertTrue(ray.modify() instanceof SlowAcceleration);
    }
}
