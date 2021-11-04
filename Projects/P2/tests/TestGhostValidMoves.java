import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();

		// Creating Players
		Ghost ghost = frame.addGhost(new Location(0, 0), "ghost", Color.blue);
		frame.getMap().add("Ghost", new Location(0,0), null, Map.Type.GHOST);
		
		// Test that locations produced by get_valid_moves are actually movable. 
		for(Location x : ghost.get_valid_moves()){
			assertTrue(frame.getMap().getLoc(x).contains(Map.Type.WALL)==false);

		}
	}
}
