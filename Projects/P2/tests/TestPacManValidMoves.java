import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		// Creating Map
		MainFrame frame = new MainFrame(); 

		// Creating Players
		PacMan pacman = frame.addPacMan(new Location(0, 0));
		frame.getMap().add("Pacman", new Location(0,0),null,Map.Type.PACMAN);
		
		// Test that locations produced by get_valid_moves are actually movable. 
		for(Location x : pacman.get_valid_moves()){
			assertTrue(frame.getMap().getLoc().contains(Type.WALL)==False);
		}
	}
}
