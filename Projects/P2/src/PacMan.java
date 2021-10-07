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

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
