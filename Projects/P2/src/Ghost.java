import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;
	}

	public boolean move() {
		ArrayList<Location> validMoves = get_valid_moves();
		if (validMoves.size() > 0) {
			/* If a valid move exists, the ghost will move in the first valid direction 
			returned by get_valid_moves() */
			myLoc.shift(validMoves.get(0).x - myLoc.x, validMoves.get(0).y - myLoc.y);
			return true;
		}
		return false;
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

	public boolean attack() {
		return false;
	}
}
