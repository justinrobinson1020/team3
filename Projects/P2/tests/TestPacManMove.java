import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testAttack() throws FileNotFoundException {
		// Creating A Map
		MainFrame frame = new MainFrame(); // Creates A New Map With Walls and Tokens Initialized

		// Creating Players
		PacMan pacman = frame.addPacMan(new Location(0, 0)); // Creates PacMan at location x, y

		assertEquals(true, pacman.move());
	}
}
