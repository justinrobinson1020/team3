import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie extends TestCase {
	
	public void testMapEatCookie() throws FileNotFoundException{
		NoFrame fr = new NoFrame();
		Location loc = new Location(0,1);
		PacMan pm = fr.addPacMan(loc); 
		assertEquals(pm.consume(), null);
	}
}
