import java.awt.Color;
import junit.framework.*;

public class TestMapAttack {

	public void testMapAttack() {
		Location pacmanloc = new Location(9, 11);
		Location adj_ghostloc = new Location(9, 12);
		Location nonadj_ghostloc = new Location(11, 12);
		
		PacMan pacman = frame.addPacMan(pacmanloc);
		NoFrame frame = new NoFrame();

		Ghost nonadj_ghost = frame.addGhost(nonadj_ghostloc, "Non-Adjacent Ghost", Color.red);
		assertFalse(frame.getMap().attack("Non-Adjacent Ghost"));

		Ghost adj_ghost = frame.addGhost(adj_ghostloc, "Adjacent Ghost", Color.blue);
		assertTrue(frame.getMap().attack("Adjacent Ghost"))	
	}
}
