package entity.Test;

import static org.junit.Assert.*;

import entity.Permeability;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.mobile.Rock;

public class ElementTest {

	
	static Rock Rock;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Rock = new Rock();
	}

	@Test
	public void testgetPermeability() {
		final Permeability PExpected = Permeability.BOULDER;
		assertEquals(PExpected, Rock.getPermeability());
	}

	@Test
	public void testgetSprite() {
		assertNotNull(Rock.getSprite());
	}
}
