package mx.iteso.mariokart.behaviors.impl;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class SoFastTest {
	
	SoFast soFastAcceleration;
	
	@Before
	public void setUp() {
		soFastAcceleration = new SoFast();
	}
	
	@Test
	public void testSoFast() {
		assertEquals("Your velocity is very so fast, bro", soFastAcceleration.setAcceleration());
	}
}