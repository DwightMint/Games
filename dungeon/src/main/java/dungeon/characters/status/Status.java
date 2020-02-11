package dungeon.characters.status;

public class Status {
	private Strength strength;
	private Power power;
	private Armor armor;
	private HitPoint hitPoints;
	private Mana mana;
	private Dodge dodge;
	
	public Status(Strength str, Power power, Armor armor, HitPoint hp, Mana mana, Dodge dodge) {
		this.strength = str;
		this.power = power;
		this.armor = armor;
		this.hitPoints = hp;
		this.mana = mana;
		this.dodge = dodge;
	}

	public Strength getStrength() {
		return strength;
	}

	public void setStrength(Strength strength) {
		this.strength = strength;
	}

	public Power getPower() {
		return power;
	}

	public void setPower(Power power) {
		this.power = power;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public HitPoint getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(HitPoint hitPoints) {
		this.hitPoints = hitPoints;
	}

	public Mana getMana() {
		return mana;
	}

	public void setMana(Mana mana) {
		this.mana = mana;
	}

	public Dodge getDodge() {
		return dodge;
	}

	public void setDodge(Dodge dodge) {
		this.dodge = dodge;
	}
		
}
