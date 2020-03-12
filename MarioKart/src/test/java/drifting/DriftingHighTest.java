package drifting;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import acceleration.Acceleration;
import acceleration.Fast;
import characters.Mario;

public class DriftingHighTest {
	Acceleration ac;
	Drifting d;
	Mario c;
	
	@Before
	public void setUp() {
		this.ac = new Fast();
		d = new Low();
		c = mock(Mario.class);
	}
	
	@Test
	public void testSet() {
		ac.setAcceleration(10);
		d.drift(c);
		assertEquals(7, ac.getAcceleration());
	}
}
