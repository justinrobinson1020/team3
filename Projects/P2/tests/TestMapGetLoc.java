import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.HashSet;


public class TestMapGetLoc extends TestCase {
	
	public void testMapGetLoc() throws FileNotFoundException {
		// Creating A Map
		NoFrame frame = new NoFrame(); // Creates A New Map With Walls and Tokens Initialized

		// Creating Players
		PacMan pacman = frame.addPacMan(new Location(0, 0)); // Creates PacMan at location x, y
		Ghost ghost = frame.addGhost(new Location(0, 0), "name", Color.red); // Creates a red ghost named "name" at location x, y

		HashSet<Map.Type> playersSet = new HashSet<Map.Type>();
		playersSet.add(Map.Type.PACMAN);
		playersSet.add(Map.Type.GHOST);

		assertTrue(frame.getMap().getLoc(new Location (0,0)).containsAll(playersSet));
	}
}
