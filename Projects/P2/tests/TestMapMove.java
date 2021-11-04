import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase{

	public void testMapMove() throws FileNotFoundException {
		// Creating Map
		NoFrame frame = new NoFrame(); 

		// Adding Pacman and Ghost
		frame.addGhost(new Location(1,3), "ghost", Color.blue)
		frame.addPacMan(new Location(1,1))

		assertTrue(frame.getMap().move("Pacman",new Location(2, 1), Map.Type.PACMAN));
		assertFalse(frame.getMap().move("Ghost",new Location(0, 0), Map.Type.GHOST));
	}
}
