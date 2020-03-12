package mx.iteso.mariokart.behaviors.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NormalDriftTest {
	NormalDrift normalDrift;
	
	@Before
	public void setUp() {
		normalDrift = new NormalDrift();
	}
	
	@Test
	public void testnormalDrift() {
		assertEquals("This is a normal drift", normalDrift.drift());
	}
}
