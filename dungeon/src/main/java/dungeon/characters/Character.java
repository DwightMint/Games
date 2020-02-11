package dungeon.characters;

import dungeon.characters.status.Status;
import dungeon.items.BagPack;
import dungeon.position.Position;

public class Character {
	protected String name;
	protected Status status;
	protected Equipment equipments;
	protected BagPack bagPack;
	protected Position position;
	
	public Character(String name, Status status, Equipment equipments, BagPack bagPack, Position position) {
		this.name = name;
		this.status = status;
		this.equipments = equipments;
		this.bagPack = bagPack;
		this.position = position;
	}
	
	public Character(String name, Status status, Position position) {
		this.name = name;
		this.status = status;
		this.equipments = new Equipment();
		this.bagPack = new BagPack();
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BagPack getBagPack() {
		return bagPack;
	}

	/**
	 * Check how to change the backpack for a bigger
	 * @param bagPack
	 */
	public void switchBagPack(BagPack bagPack) {
		this.bagPack = bagPack;
	}
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
}
