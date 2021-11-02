import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		MainFrame frame = new MainFrame(); 

		// Creating Players
		Ghost ghost = frame.addGhost(new Location(0, 0));
		frame.getMap().add("Ghost", new Location(0,0),null,Type.GHOST);
		
		// Test that locations produced by get_valid_moves are actually movable. 
		for(Location x : ghost.get_valid_moves()){
			assertTrue(frame.getMap().move("Ghost",x,Type.GHOST));
		}
	}
}
