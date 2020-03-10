package com.strategy.practice;

import com.strategy.practice.behaviors.imp.FastAcceleration;
import com.strategy.practice.characters.Bowser;
import com.strategy.practice.characters.Mario;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MarioTest {

    Mario mario;
    Item mockedItem;

    @Before
    public void setUp() {
        this.mario = new Mario();
        this.mockedItem = mock(Item.class);
        this.mario.setItem(mockedItem);
    }

    @Test
    public void testAccelerate() {
        assertEquals("I´m running normal", mario.accelerate());
    }

    @Test
    public void testItemAcceleration() {
        when(mockedItem.modify()).thenReturn(new FastAcceleration());
        assertEquals("I´m very very very fast", mario.itemAcceleration());
    }

    @Test
    public void testDrift() {
        assertEquals("I'm normally drifting, nothing special :v", mario.drift());
    }
}
