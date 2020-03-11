package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class VerySlowTest {
	VerySlow veryslowacc;
	
	@Before
	public void setUp() {
		veryslowacc = new VerySlow();
	}
	
	@Test
	public void testAccReturn() {
		assertEquals("Very slow speed", veryslowacc.accelerate());
	}

}
