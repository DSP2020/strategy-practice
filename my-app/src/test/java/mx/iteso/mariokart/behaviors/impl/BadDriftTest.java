package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BadDriftTest {
	BadDrift badDr;
	
	@Before
	public void setUp() {
		badDr = new BadDrift();
	}
	
	@Test
	public void testDrReturn() {
		assertEquals("Bad drift", badDr.drift());
	}
}
