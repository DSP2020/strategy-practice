package com.strategy.practice;

import com.strategy.practice.behaviors.imp.SlowAcceleration;
import com.strategy.practice.characters.Luigi;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LuigiTest {

    Luigi luigi;
    Item mockedItem;

    @Before
    public void setUp() {
        this.luigi = new Luigi();
        this.mockedItem = mock(Item.class);
        this.luigi.setItem(mockedItem);
    }

    @Test
    public void testAccelerate() {
        assertEquals("I´m very very very fast", luigi.accelerate());
    }

    @Test
    public void testItemAcceleration() {
        when(mockedItem.modify()).thenReturn(new SlowAcceleration());
        assertEquals("Help me, I'm slow :(", luigi.itemAcceleration());
    }

    @Test
    public void testDrift() {
        assertEquals("I'm really drifting, so long, so fast, so cool :B", luigi.drift());
    }
}
