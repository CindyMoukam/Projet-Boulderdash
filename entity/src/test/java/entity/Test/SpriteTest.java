package entity.Test;

import static org.junit.Assert.*;

import entity.mobile.Rock;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.mobile.Rock;

/**
 * @author Laetitia
 *
 */
public class SpriteTest {

	static Rock Rock;

	/**
	 * Instanciates a new rock
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Rock = new Rock();
	}
	

	/**
	 *  test get the image
	 */
	@Test
	public void testgetImageName() {
		final String SExpected = "boulder.png";
		assertEquals(SExpected, Rock.getImage());
	}

	/**
	 * test the get console image
	 */
	@Test
	public void testgetConsoleImage() {
		final char CExpected = 'O';
		assertEquals(CExpected, Rock.getSprite().getConsoleImage());
	}

}
