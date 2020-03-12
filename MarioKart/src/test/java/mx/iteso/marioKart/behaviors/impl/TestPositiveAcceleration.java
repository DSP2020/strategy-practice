package mx.iteso.marioKart.behaviors.impl;

import mx.iteso.marioKart.characters.Toad;
import mx.iteso.marioKart.items.Rocket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestPositiveAcceleration {

    PositiveAcceleration positiveAcceleration;

    @Before
    public void setUp(){
        positiveAcceleration = new PositiveAcceleration();
    }

    @Test
    public void acceleration(){
        assertEquals("go fast!",positiveAcceleration.acceleration(new Toad().getCurrentVelocity(),new Rocket()));
    }

}
