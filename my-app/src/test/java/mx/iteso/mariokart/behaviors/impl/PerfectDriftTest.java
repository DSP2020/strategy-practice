package mx.iteso.mariokart.behaviors.impl;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class PerfectDriftTest {
	PerfectDrift perfectDr;
	
	@Before
	public void setUp() {
		perfectDr = new PerfectDrift();
	}
	
	@Test
	public void testDrReturn() {
		assertEquals("Perfect drift", perfectDr.drift());
	}
}
