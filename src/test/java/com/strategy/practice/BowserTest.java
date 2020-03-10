package com.strategy.practice;

import com.strategy.practice.behaviors.imp.FastAcceleration;
import com.strategy.practice.characters.Bowser;
import com.strategy.practice.items.Star;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BowserTest {

    Bowser bowser;
    Item mockedItem;

    @Before
    public void setUp() {
        this.bowser = new Bowser();
        this.mockedItem = mock(Item.class);
        this.bowser.setItem(mockedItem);
    }

    @Test
    public void testAccelerate() {
        assertEquals("Help me, I'm slow :(", bowser.accelerate());
    }

    @Test
    public void testItemAcceleration() {
        when(mockedItem.modify()).thenReturn(new FastAcceleration());
        assertEquals("I´m very very very fast", bowser.itemAcceleration());
    }

    @Test
    public void testDrift() {
        assertEquals("I'm heavy and slow, I barely drift >:(", bowser.drift());
    }
}
