import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestAttack extends TestCase {

	public void testAttack() throws FileNotFoundException{
	    NoFrame fr = new NoFrame();
	    Location loc1 = new Location(2,1);
	    Location loc2 = new Location(3,1);
	    Ghost g = fr.addGhost(loc1, "ghost", Color.RED);
	    Pacman pm = fr.addPacMan(loc2);
	    assertTrue(g.attack());
// 		return null;	
	}
}
