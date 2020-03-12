package mx.iteso.mariokart.items;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class HongoTest {
	Hongo hongo;
	
	@Before
	public void setUp() {
		hongo = new Hongo();
		hongo.setTiempo(3);
	}
	
	@Test
	public void testGetTime() {
		assertEquals(3, hongo.getTiempo());
	}
	
	@Test
	public void testSetTime() {
		hongo.setTiempo(7);
		assertEquals(7, hongo.getTiempo());
	}
}