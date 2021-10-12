import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		NoFrame fr = new NoFrame();
	    Location loc = new Location(1,1);
	    Pacman pm = fr.addPacMan(loc);
	    assertTrue(pm.consume() == null);
// 		return null;		
	}
}
