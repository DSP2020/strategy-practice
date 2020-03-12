/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.iteso.ut.Items;

import mx.iteso.mariokart.items.BulletBill;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author coque
 */
public class BulletBillTest {
    BulletBill  bulletBill;
    
    @Before
    public void setUp(){
        bulletBill = new  BulletBill();
    }
    
    @Test
    public void testGetName(){
        assertEquals("BulletBill",bulletBill.getName());
    }
}
