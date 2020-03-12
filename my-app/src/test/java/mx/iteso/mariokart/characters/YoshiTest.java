package mx.iteso.mariokart.characters;

import org.junit.Test;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.BadDrift;
import mx.iteso.mariokart.behaviors.impl.Normal;
import mx.iteso.mariokart.behaviors.impl.NormalDrift;
import mx.iteso.mariokart.behaviors.impl.Slow;
import mx.iteso.mariokart.items.Boo;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class YoshiTest {
	Yoshi yoshi;
	Acceleration mockedAcceleration;
	Acceleration mockedSlowAcc;
	Drift mockedDrift;
	Drift mockedBadDr;
	Item mockedItem;
	
	@Before
	public void setUp() {
		yoshi = new Yoshi();
		mockedAcceleration = mock(Normal.class);
		mockedSlowAcc = mock(Slow.class);
		mockedDrift = mock(NormalDrift.class);
		mockedBadDr = mock(BadDrift.class);
		mockedItem = mock(Boo.class);
		yoshi.setAcceleration(mockedAcceleration);
		yoshi.setDrift(mockedDrift);
	}
	
	@Test
	public void testGetAcceleration() {
		when(mockedAcceleration.accelerate()).thenReturn("Fast speed");
		assertEquals("Fast speed", yoshi.getAcceleration().accelerate());
	}
	
	@Test
	public void testSetAcceleration() {
		when(mockedSlowAcc.accelerate()).thenReturn("Slow speed");
		yoshi.setAcceleration(mockedSlowAcc);
		assertEquals("Slow speed", yoshi.getAcceleration().accelerate());
	}
	
	@Test
	public void testGetDrift() {
		when(mockedDrift.drift()).thenReturn("Normal drift");
		assertEquals("Normal drift", yoshi.getDrift().drift());
	}
	
	@Test
	public void testSetDrift() {
		when(mockedBadDr.drift()).thenReturn("Bad drift");
		yoshi.setDrift(mockedBadDr);
		assertEquals("Bad drift", yoshi.getDrift().drift());
	}
	
	@Test
	public void testActiveItem() {
		doCallRealMethod().when(mockedItem).itemEffect(yoshi);
		yoshi.activeItem(mockedItem);
		assertEquals("Slow speed", yoshi.getAcceleration().accelerate());
		assertEquals("Normal drift", yoshi.getDrift().drift());
	}
}
