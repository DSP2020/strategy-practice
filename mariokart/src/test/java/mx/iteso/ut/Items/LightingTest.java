package mx.iteso.ut.Items;

import mx.iteso.mariokart.items.Lightning;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coque
 */
public class LightingTest {
    Lightning  lightning;
    
    @Before
    public void setUp(){
        lightning = new  Lightning();
    }
    
    @Test
    public void testGetName(){
        assertEquals("Lightning",lightning.getName());
    }
    
}
