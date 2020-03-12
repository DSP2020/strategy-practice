package mx.iteso.mariokart.characters;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import mx.iteso.mariokart.Item;
import mx.iteso.mariokart.behaviors.Acceleration;
import mx.iteso.mariokart.behaviors.Drift;
import mx.iteso.mariokart.behaviors.impl.Fast;
import mx.iteso.mariokart.behaviors.impl.GoodDrift;
import mx.iteso.mariokart.behaviors.impl.NormalDrift;
import mx.iteso.mariokart.behaviors.impl.VeryFast;
import mx.iteso.mariokart.items.Rayo;

public class LuigiTest {
	Luigi luigi;
	Acceleration mockedAcc;
	Item mockedItem;
	Acceleration mockedIt;
	Drift mockedDri;
	Drift mockedSetDri;
	
	
	@Before
	public void setUp() {
		luigi = new Luigi();
		mockedAcc = mock(Fast.class);
		mockedItem = new Rayo();
		mockedIt = mock(VeryFast.class);
		luigi.setAcelerate(mockedAcc);
		mockedDri = mock(NormalDrift.class);
		mockedSetDri = mock(GoodDrift.class);
		luigi.setDrift(mockedDri);	
	}
	
	@Test
	public void testGetAc() {
		when(mockedAcc.setAcceleration()).thenReturn("Your velocity is fast, bro");
		assertEquals("Your velocity is fast, bro", luigi.getAcelerate().setAcceleration());
	}
	
	@Test
	public void testSetAc() {
		when(mockedIt.setAcceleration()).thenReturn("Your velocity is very fast, bro");
		luigi.setAcelerate(mockedIt);
		assertEquals("Your velocity is very fast, bro", luigi.getAcelerate().setAcceleration());
	}
	
	@Test
	public void testtakeEffect() {
		luigi.takeEffect(mockedItem);
		assertEquals("Your velocity is very low, bro", luigi.getAcelerate().setAcceleration());
		assertEquals("This is a bad drift", luigi.getDrift().drift());
	}
	
	@Test
	public void testGetDr() {
		when(mockedDri.drift()).thenReturn("This is a normal drift");
		assertEquals("This is a normal drift", luigi.getDrift().drift());
	}
	
	@Test
	public void testSetDr() {
		when(mockedSetDri.drift()).thenReturn("This is a good drift");
		luigi.setDrift(mockedSetDri);
		assertEquals("This is a good drift", luigi.getDrift().drift());
	}	
	
}