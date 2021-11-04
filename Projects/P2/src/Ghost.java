import java.util.HashSet;
import java.util.ArrayList;
import java.util.*;

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

		for(int i = 0; i < locations.size(); i++) {
			if(myMap.getLoc(locations.get(i)).contains(Map.Type.WALL)){
				locations.remove(i);
				i--;
			}
		}

		return locations;
	}

	public boolean move() {
		Random rand = new Random();
		ArrayList<Location> valid_moves = this.get_valid_moves();
		if (valid_moves.size() < rand.nextInt(valid_moves.size())) {
			myLoc = valid_moves.get(rand.nextInt(valid_moves.size()));
			myMap.move(myName, myLoc, Map.Type.GHOST);
			return true;
		}
		return false;
	}

	public boolean is_pacman_in_range() { 
		if (myMap.getLoc(myLoc.shift(1, 0)).contains(Map.Type.PACMAN) || 
			myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.PACMAN) || 
			myMap.getLoc(myLoc.shift(1, 1)).contains(Map.Type.PACMAN) ||
			myMap.getLoc(myLoc.shift(-1, 0)).contains(Map.Type.PACMAN) ||
			myMap.getLoc(myLoc.shift(0, -1)).contains(Map.Type.PACMAN) ||
			myMap.getLoc(myLoc.shift(-1, -1)).contains(Map.Type.PACMAN) ||
			myMap.getLoc(myLoc.shift(1, -1)).contains(Map.Type.PACMAN) ||
			myMap.getLoc(myLoc.shift(-1, 1)).contains(Map.Type.PACMAN)) {
				return true;
		}
		return false;
	}

	public boolean attack() {
		if (!is_pacman_in_range()) {
		    return myMap.attack("sabotage");
		}
		return false;
	}
}
