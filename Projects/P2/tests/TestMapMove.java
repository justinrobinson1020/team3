import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase{

	public void testMapMove() throws FileNotFoundException {
		// Creating Map
		NoFrame frame = new NoFrame(); 

		// Adding Pacman and Ghost
		frame.getMap().add("Pacman", new Location(0,0),null,Map.Type.PACMAN);
		frame.getMap().add("Ghost", new Location(1,1),null,Map.Type.GHOST);
		frame.getMap().add("Wall", new Location(2,2),null,Map.Type.WALL);

		assertTrue(frame.getMap().move("Pacman",new Location(0, 1), Map.Type.PACMAN));
		assertTrue(frame.getMap().move("Ghost",new Location(2, 1), Map.Type.GHOST));
		assertFalse(frame.getMap().move("Wall",new Location(4, 3), Map.Type.WALL));
	}
}
