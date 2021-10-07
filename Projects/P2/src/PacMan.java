import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;	
	}

	public boolean move() {
		Array<Location> validMoves = get_valid_moves().toArray();
		if (validMoves.length > 0) {
			/* If a valid move exists, PacMan will move in the first valid direction 
			returned by get_valid_moves() */
			myLoc.shift(validMoves[0].x - myLoc.x, validMoves[0].y - myLoc.y);
			return true;
		}
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
