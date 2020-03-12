/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.ut.Accelerations;
import mx.iteso.mariokart.behaviors.behaviors.impl.*;
import mx.iteso.mariokart.items.BulletBill;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author coque
 */
public class VeryFastTest {
    VeryFast  veryFast;
    
    @Before
    public void setUp(){
        veryFast = new  VeryFast();
    }
    
    @Test
    public void testDoVeryFastAcceleration(){
        assertEquals("Very Fast Aceleration",veryFast.doAcceleration());
    }
}
