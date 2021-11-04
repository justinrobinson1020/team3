import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase{

	public void testMapMove() throws FileNotFoundException {
		// Creating Map
		NoFrame frame = new NoFrame(); 

		// Adding Pacman and Ghost
<<<<<<< HEAD
		frame.addGhost(new Location(1,3), "ghost", Color.blue)
		frame.addPacMan(new Location(1,1))

		assertTrue(frame.getMap().move("Pacman",new Location(2, 1), Map.Type.PACMAN));
		assertFalse(frame.getMap().move("Ghost",new Location(0, 0), Map.Type.GHOST));
=======
		frame.getMap().add("Pacman", new Location(1,2),null,Map.Type.PACMAN);
		frame.getMap().add("Ghost", new Location(1,1),null,Map.Type.GHOST);
		frame.getMap().add("Wall", new Location(2,2),null,Map.Type.WALL);

		assertTrue(frame.getMap().move("Pacman",new Location(1, 3), Map.Type.PACMAN));
		assertTrue(frame.getMap().move("Ghost",new Location(2, 1), Map.Type.GHOST));
		assertFalse(frame.getMap().move("Wall",new Location(4, 3), Map.Type.WALL));
>>>>>>> 6339f448d127c44450b966442d8cc3fd4fb06228
	}
}
