import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		Location pacmanloc = new Location(9, 11);
		Location adj_ghostloc = new Location(9, 12);
		Location nonadj_ghostloc = new Location(11, 12);
		
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(pacmanloc);

		Ghost nonadj_ghost = frame.addGhost(nonadj_ghostloc, "Non-Adjacent Ghost", Color.red);
		assertFalse(nonadj_ghost.is_pacman_in_range());

		Ghost adj_ghost = frame.addGhost(adj_ghostloc, "Adjacent Ghost", Color.blue);
		assertTrue(adj_ghost.is_pacman_in_range());
	}
}

