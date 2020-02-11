package dungeon.display;

import java.awt.Graphics;
import java.util.LinkedList;

import dungeon.display.graphics.GameObject;

public class Handler {
	public LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public void tick() {
		for(GameObject tempObject : object) {
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		for(GameObject tempObject : object) {
			tempObject.render(g);
		}
	}
	
	public void addObject(GameObject tempGameObject) {
		object.add(tempGameObject);
	}
	
	public void removeObject(GameObject tempsGameObject) {
		object.remove(tempsGameObject);
	}
}
