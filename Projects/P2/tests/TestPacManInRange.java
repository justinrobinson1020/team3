import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{
		Location pacmanloc = new Location(9, 11);
		Location adj_ghostloc = new Location(9, 12);
		Location nonadj_ghostloc = new Location(11, 12);
		
		PacMan pacman = frame.addPacMan(pacmanloc);
		NoFrame frame = new NoFrame();

		Ghost nonadj_ghost = frame.addGhost(nonadj_ghostloc, "Non-Adjacent Ghost", Color.red);
		assertFalse(pacman.is_ghost_in_range());

		Ghost adj_ghost = frame.addGhost(adj_ghostloc, "Adjacent Ghost", Color.blue);
		assertTrue(pacman.is_ghost_in_range())
	}
}
