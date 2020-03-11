package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class VeryFastTest {
	VeryFast veryfastacc;
	
	@Before
	public void setUp() {
		veryfastacc = new VeryFast();
	}
	
	@Test
	public void testAccReturn() {
		assertEquals("Very fast speed", veryfastacc.accelerate());
	}

}
