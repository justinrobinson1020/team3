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
		int x = myLoc.x;
		int y = myLoc.y;
		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(x-1,y-1));
		locations.add(new Location(x-1,y));
		locations.add(new Location(x-1,y+1));
		locations.add(new Location(x,y-1));
		locations.add(new Location(x,y+1));
		locations.add(new Location(x+1,y-1));
		locations.add(new Location(x+1,y));
		locations.add(new Location(x+1,y+1));
		for(Location loc : locations){
			if(myMap.getLoc(loc).contains(Map.Type.WALL)){
				locations.remove(loc);
			}
		}

		return locations;
	}

	public boolean move() {
		return false;
	}

	public boolean is_pacman_in_range() { 
		if (myMap.getLoc(myLoc.shift(1, 0)).contains(Map.Type.PACMAN) || 
			myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.PACMAN) || 
			myMap.getLoc(myLoc.shift(1, 1)).contains(Map.Type.PACMAN) ||
			myMap.getLoc(myLoc.shift(-1, 0)).contains(Map.Type.PACMAN) ||
			myMap.getLoc(myLoc.shift(0, -1)).contains(Map.Type.PACMAN) ||
			myMap.getLoc(myLoc.shift(-1, -1)).contains(Map.Type.PACMAN)) {
				return true;
		}
		return false;
	}

	public boolean attack() {
		if (is_pacman_in_range() == true) {
		    return myMap.attack(myName)
		}
		return false;
	}
}
