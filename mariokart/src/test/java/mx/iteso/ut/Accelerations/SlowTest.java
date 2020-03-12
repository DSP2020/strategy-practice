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
public class SlowTest {
    Slow  slow;
    
    @Before
    public void setUp(){
        slow = new  Slow();
    }
    
    @Test
    public void testDoSlowAcceleration(){
        assertEquals("Slow Aceleration",slow.doAcceleration());
    }

}
