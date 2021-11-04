import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map{

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE		
	}
	
	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components; 
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet; 

	private int cookies = 0;

	public Map(int dim){
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}


	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}
		
	public boolean move(String name, Location loc, Type type) {
		if(type!=Type.PACMAN && type!=Type.GHOST){
			return false;
		}
		if(field.get(loc) != null && (field.get(loc).contains(Type.EMPTY) || field.get(loc).contains(Type.COOKIE))){
			Location oldLoc = locations.get(name);
			locations.put(name,loc);
			components.get(name).setLocation(loc.x, loc.y);
			field.get(oldLoc).remove(type);
			field.get(loc).add(type);
			return true;
		}
		return false;
	}
	
	public HashSet<Type> getLoc(Location loc) {
		//wallSet and emptySet will help you write this method
		HashSet<Type> comp = field.get(loc);
		return comp == null ? emptySet : comp;
	}

	public boolean attack(String Name) {
		// get location of ghost
		Location ghostLoc = locations.get(Name);

		// If ghost can attack, set gameOver to true
		if (this.getLoc(ghostLoc.shift(1, 0)).contains(Map.Type.PACMAN) || 
			this.getLoc(ghostLoc.shift(0, 1)).contains(Map.Type.PACMAN) || 
			this.getLoc(ghostLoc.shift(1, 1)).contains(Map.Type.PACMAN) ||
			this.getLoc(ghostLoc.shift(-1, 0)).contains(Map.Type.PACMAN) ||
			this.getLoc(ghostLoc.shift(0, -1)).contains(Map.Type.PACMAN) ||
			this.getLoc(ghostLoc.shift(-1, -1)).contains(Map.Type.PACMAN) ||
			this.getLoc(ghostLoc.shift(1, -1)).contains(Map.Type.PACMAN) ||
			this.getLoc(ghostLoc.shift(-1, 1)).contains(Map.Type.PACMAN)) {
			gameOver = true;
			return true;
		}

		return false;
	}
	
	public JComponent eatCookie(String name) {
		Location currLoc = locations.get(name); 
		String currCookieName = "tokx" + currLoc.x + "y" + currLoc.y;
		if (locations.containsKey(currCookieName) && components.containsKey(currCookieName)) {
			cookies++;
			locations.remove(currCookieName);
			JComponent out = components.get(currCookieName);
			components.remove(currCookieName);
			field.get(currLoc).remove(Map.Type.WALL);
			return null;
		}
		return components.get(currCookieName);
	}
}
