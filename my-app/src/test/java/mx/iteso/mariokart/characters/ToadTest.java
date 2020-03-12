package mx.iteso.mariokart.characters;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.BadDrift;
import mx.iteso.mariokart.behaviors.impl.Fast;
import mx.iteso.mariokart.behaviors.impl.GoodDrift;
import mx.iteso.mariokart.behaviors.impl.NormalDrift;
import mx.iteso.mariokart.behaviors.impl.VeryFast;
import mx.iteso.mariokart.items.Hongo;

public class ToadTest {
	Toad toad;
	Acceleration mockedAcc;
	Item mockedItem;
	Acceleration mockedIt;
	Drift mockedDri;
	Drift mockedSetDri;
	
	@Before
	public void setUp() {
		toad = new Toad();
		mockedAcc = mock(Fast.class);
		mockedItem = new Hongo();
		mockedIt = mock(VeryFast.class);
		toad.setAcelerate(mockedAcc);
		mockedDri = mock(NormalDrift.class);
		mockedSetDri = mock(BadDrift.class);
		toad.setDrift(mockedDri);	
	}
	
	@Test
	public void testGetAc() {
		when(mockedAcc.setAcceleration()).thenReturn("Your velocity is fast, bro");
		assertEquals("Your velocity is fast, bro", toad.getAcelerate().setAcceleration());
	}
	
	@Test
	public void testSetAc() {
		when(mockedIt.setAcceleration()).thenReturn("Your velocity is very fast, bro");
		toad.setAcelerate(mockedIt);
		assertEquals("Your velocity is very fast, bro", toad.getAcelerate().setAcceleration());
	}
	
	@Test
	public void testtakeEffect() {
		toad.takeEffect(mockedItem);
		assertEquals("Your velocity is very fast, bro", toad.getAcelerate().setAcceleration());
		assertEquals("This is a good drift", toad.getDrift().drift());
	}

	@Test
	public void testGetDr() {
		when(mockedDri.drift()).thenReturn("This is a normal drift");
		assertEquals("This is a normal drift", toad.getDrift().drift());
	}
	
	@Test
	public void testSetDr() {
		when(mockedSetDri.drift()).thenReturn("This is a bad drift");
		toad.setDrift(mockedSetDri);
		assertEquals("This is a bad drift", toad.getDrift().drift());
	}
}