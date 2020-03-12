package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class GreatDriftTest {
	GreatDrift greatDr;
	
	@Before
	public void setUp() {
		greatDr = new GreatDrift();
	}
	
	@Test
	public void testDrReturn() {
		assertEquals("Great drift", greatDr.drift());
	}
}
