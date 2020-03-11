package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SlowTest {
	Slow slowacc;
	
	@Before
	public void setUp() {
		slowacc = new Slow();
	}
	
	@Test
	public void testAccReturn() {
		assertEquals("Slow speed", slowacc.accelerate());
	}

}
