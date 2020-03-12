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
public class NormalTest {
    Normal  normal;
    
    @Before
    public void setUp(){
        normal = new  Normal();
    }
    
    @Test
    public void TestDoNormalDrifting(){
        assertEquals("Normal Drifting",normal.doDrifting());
    }
}
