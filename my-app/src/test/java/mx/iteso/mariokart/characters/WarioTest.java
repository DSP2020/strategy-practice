package mx.iteso.mariokart.characters;

import org.junit.Test;

import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.BadDrift;
import mx.iteso.mariokart.behaviors.impl.Fast;
import mx.iteso.mariokart.behaviors.impl.GreatDrift;
import mx.iteso.mariokart.behaviors.impl.Normal;
import mx.iteso.mariokart.items.Bolt;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class WarioTest {
	Wario wario;
	Acceleration mockedAcceleration;
	Acceleration mockedFastAcc;
	Drift mockedDrift;
	Drift mockedBadDr;
	Item mockedItem;
	
	@Before
	public void setUp() {
		wario = new Wario();
		mockedAcceleration = mock(Normal.class);
		mockedFastAcc = mock(Fast.class);
		mockedDrift = mock(GreatDrift.class);
		mockedBadDr = mock(BadDrift.class);
		mockedItem = mock(Bolt.class);
		wario.setAcceleration(mockedAcceleration);
		wario.setDrift(mockedDrift);
	}
	
	@Test
	public void testGetAcceleration() {
		when(mockedAcceleration.accelerate()).thenReturn("Slow speed");
		assertEquals("Slow speed", wario.getAcceleration().accelerate());
	}
	
	@Test
	public void testSetAcceleration() {
		when(mockedFastAcc.accelerate()).thenReturn("Fast speed");
		wario.setAcceleration(mockedFastAcc);
		assertEquals("Fast speed", wario.getAcceleration().accelerate());
	}
	
	@Test
	public void testGetDrift() {
		when(mockedDrift.drift()).thenReturn("Great drift");
		assertEquals("Great drift", wario.getDrift().drift());
	}
	
	@Test
	public void testSetDrift() {
		when(mockedBadDr.drift()).thenReturn("Bad drift");
		wario.setDrift(mockedBadDr);
		assertEquals("Bad drift", wario.getDrift().drift());
	}
	
	@Test
	public void testActiveItem() {
		doCallRealMethod().when(mockedItem).itemEffect(wario);
		wario.activeItem(mockedItem);
		assertEquals("Very slow speed", wario.getAcceleration().accelerate());
		assertEquals("Bad drift", wario.getDrift().drift());
	}

}
