package dungeon.display;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
	
	public boolean keys[] = new boolean[4];
	
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
//		if(key == KeyEvent.VK_RIGHT) keys[0] = true;
//		if(key == KeyEvent.VK_LEFT) keys[1] = true;
//		if(key == KeyEvent.VK_UP) keys[2] = true;
//		if(key == KeyEvent.VK_DOWN) keys[3] = true;
		if(key == KeyEvent.VK_D) { keys[0] = true; }
		if(key == KeyEvent.VK_Q) { keys[1] = true; }
		if(key == KeyEvent.VK_Z) { keys[2] = true; }
		if(key == KeyEvent.VK_S) { keys[3] = true; }
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
//		if(key == KeyEvent.VK_RIGHT) keys[0] = false;
//		if(key == KeyEvent.VK_LEFT) keys[1] = false;
//		if(key == KeyEvent.VK_UP) keys[2] = false;
//		if(key == KeyEvent.VK_DOWN) keys[3] = false;
		if(key == KeyEvent.VK_D) { keys[0] = false; }
		if(key == KeyEvent.VK_Q) { keys[1] = false; }
		if(key == KeyEvent.VK_Z) { keys[2] = false; }
		if(key == KeyEvent.VK_S) { keys[3] = false; }
	}
}
