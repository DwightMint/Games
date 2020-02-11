package dungeon.characters.status;

public class HitPoint {
	private int max;
	private int current;

	public HitPoint(int hp) {
		max = hp;
		current = hp;
	}
	
	public void upgradeMaxBy(int hp) {
		max += hp;
	}
	
	public void heal(int hp) {
		current += hp;
	}
	
	public void recieveDmg(int hp) {
		current -= hp;
	}
	
	public int getMax() {
		return max;
	}
	
	public int getCurrent() {
		return current;
	}
	
	
	
}
