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
		return false;
	}

	public boolean is_ghost_in_range() { 
		if (myMap.getLoc(myLoc.shift(1, 0)).contains(Map.Type.Ghost) || 
			myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.Ghost) || 
			myMap.getLoc(myLoc.shift(1, 1)).contains(Map.Type.Ghost) ||
			myMap.getLoc(myLoc.shift(-1, 0)).contains(Map.Type.Ghost) ||
			myMap.getLoc(myLoc.shift(0, -1)).contains(Map.Type.Ghost) ||
			myMap.getLoc(myLoc.shift(-1, -1)).contains(Map.Type.Ghost)) {
				return true;
		}
		return false;
	}

	public JComponent consume() { 
	    HashSet<Map.Type> getloc = myMap.getLoc(myLoc);
	    if(getloc != null && getloc.contains(Map.Type.COOKIE)) {
	        return myMap.eatCookie(myName)
	    }
 		return null;
	}
}
