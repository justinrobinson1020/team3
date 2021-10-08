import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie {
	
	public void testMapEatCookie() {
	    	try{
			NoFrame fr = new NoFrame();
			Location loc = new Location(0,1)
			PacMan pm = fr.addPacMan(loc); 
			assertTrue((pm.consume(), null));
		}
		catch(Exception e){
			assertTrue(1==4);
		}
//		return null;
	}
}
