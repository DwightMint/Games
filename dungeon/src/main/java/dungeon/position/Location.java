package dungeon.position;

public class Location {
	private int x;
	private int y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void up() {
		y++;
	}
	
	public void down() {
		y--;
	}
	
	public void left() {
		x--;
	}
	
	public void right() {
		x++;
	}
}
