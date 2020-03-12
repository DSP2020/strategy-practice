/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.ut.Driftings;
import mx.iteso.mariokart.behaviors.behaviors.impl.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author coque
 */
public class WideTest {
    Wide  wide;
    
    @Before
    public void setUp(){
        wide = new  Wide();
    }
    
    @Test
    public void TestDoWideDrifting(){
        assertEquals("Wide Drifting",wide.doDrifting());
    }
}
