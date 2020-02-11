package dungeon.position;

public class Position {
	private Location location;
	private Orientation orientation;
	
	public Position(Location location, Orientation orientation) {
		this.location = location;
		this.orientation = orientation;
	}
	
	public void moveUp() {
		this.orientation = Orientation.NORTH;
		this.location.up();
	}
	
	/**	moves to finish **/
}
