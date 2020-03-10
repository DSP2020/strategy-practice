package com.strategy.practice;

import com.strategy.practice.behaviors.imp.NormalAcceleration;
import com.strategy.practice.items.Mushroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MushroomTest {

    Mushroom mushroom;

    @Before
    public void setUp() {
        this.mushroom = new Mushroom();
    }

    @Test
    public void modifyTest() {
        assertTrue(mushroom.modify() instanceof NormalAcceleration);
    }
}
