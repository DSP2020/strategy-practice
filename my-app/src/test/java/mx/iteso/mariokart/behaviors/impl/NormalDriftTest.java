package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class NormalDriftTest {
	NormalDrift normalDr;
	
	@Before
	public void setUp() {
		normalDr = new NormalDrift();
	}
	
	@Test
	public void testDrReturn() {
		assertEquals("Normal drift", normalDr.drift());
	}
}
