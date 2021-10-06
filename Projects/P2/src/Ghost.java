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
		return false;
	}

	public boolean is_pacman_in_range() { 
		if (myMap.getLoc(myLoc.shift(1, 0)) == Map.Type.PacMan || 
			myMap.getLoc(myLoc.shift(0, 1)) == Map.Type.PacMan || 
			myMap.getLoc(myLoc.shift(1, 1)) == Map.Type.PacMan ||
			myMap.getLoc(myLoc.shift(-1, 0)) == Map.Type.PacMan ||
			myMap.getLoc(myLoc.shift(0, -1)) == Map.Type.PacMan ||
			myMap.getLoc(myLoc.shift(-1, -1)) == Map.Type.PacMan) {
				return true;
		}
		return false;
	}

	public boolean attack() {
		return false;
	}
}
