/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.ut.Items;
import mx.iteso.mariokart.items.Mushroom;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


/**
 *
 * @author coque
 */
public class MushroomTest {
    Mushroom  mushroom;
    
    @Before
    public void setUp(){
        mushroom = new  Mushroom();
    }
    
    @Test
    public void testGetName(){
        assertEquals("Mushroom",mushroom.getName());
    }
    
    
}
