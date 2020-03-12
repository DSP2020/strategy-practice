package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.characters.Luigi;
import mx.iteso.marioKart.items.Thunder;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestNegativeAcceleration {
    NegativeAcceleration negativeAcceleration;

    @Before
    public void setUp(){
        negativeAcceleration = new NegativeAcceleration();
    }

    @Test
    public void acceleration(){
        assertEquals("stop",negativeAcceleration.acceleration(new Luigi().getCurrentVelocity(),new Thunder()));
    }

}
