package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class FastTest {
	Fast fastacc;
	
	@Before
	public void setUp() {
		fastacc = new Fast();
	}
	
	@Test
	public void testAccReturn() {
		assertEquals("Fast speed", fastacc.accelerate());
	}

}
