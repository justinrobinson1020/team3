import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase{

	public void testMapMove() {
		// Creating Map
		MainFrame frame = new MainFrame(); 

		// Adding Pacman and Ghost
		frame.getMap().add("Pacman", new Location(0,0),null,Type.PACMAN);
		frame.getMap().add("Ghost", new Location(1,1),null,Type.GHOST);
		frame.getMap().add("Wall", new Location(2,2),null,Type.WALL);

		assertTrue(frame.getMap().move("Pacman",new Location(3, 3), Type.PACMAN));
		assertTrue(frame.getMap().move("Ghost",new Location(2, 3), Type.GHOST));
		assertFalse(frame.getMap().move("Wall",new Location(4, 3), Type.WALL));
	}
}
