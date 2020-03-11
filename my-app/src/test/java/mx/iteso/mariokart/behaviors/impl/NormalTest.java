package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class NormalTest {
	Normal normalacc;
	
	@Before
	public void setUp() {
		normalacc = new Normal();
	}
	
	@Test
	public void testAccReturn() {
		assertEquals("Normal speed", normalacc.accelerate());
	}

}
