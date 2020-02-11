package dungeon.characters.status;

public class Armor {
	private int armor;
	
	public Armor(int armor) {
		this.armor = armor;
	}
	
	public void increaseArmorBy(int armor) {
		this.armor += armor;
	}
	
	public void decreaseArmorBy(int armor) {
		this.armor -= armor;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public int getArmor() {
		return armor;
	}
	
}
