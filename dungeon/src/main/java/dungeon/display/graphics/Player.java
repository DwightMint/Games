package dungeon.display.graphics;

import java.awt.Color;
import java.awt.Graphics;

import dungeon.Game;
import dungeon.characters.ID;
import dungeon.display.KeyInput;

public class Player extends GameObject {

	private float _acc = 32f;
	private float _dcc = 32f;
	private KeyInput input;
	
	public Player(float x, float y, ID id, KeyInput input) {
		super(x, y, id);
		this.input = input;
	}

	@Override
	public void tick() {
		
		if(x > Game.WIDTH) x = 0;
		if(x < 0) x = Game.WIDTH;
		if(y > Game.HEIGHT) y = 0;
		if(y < 0) y = Game.HEIGHT;
		
		//Horizontal movement
		if(input.keys[0]) x += _acc;
		else if(input.keys[1]) x -= _acc;
		
		//Vertical movement
		if(input.keys[2]) y -= _acc;
		else if(input.keys[3]) y += _acc;
		
//		x += velX;
//		y += velY;
//		
//		if(x > Game.WIDTH) x = 0;
//		
//		//Horizontal movement
//		if(input.keys[0]) velX += _acc;
//		else if(input.keys[1]) velX -= _acc;
//		else if(!input.keys[0] && !input.keys[1]) {
//			if(velX > 0) velX -= _dcc;
//			else if(velX < 0) velX += _dcc;
//		}
//		
//		//Vertical movement
//		if(input.keys[2]) velY -= _acc;
//		else if(input.keys[3]) velY += _acc;
//		else if(!input.keys[2] && !input.keys[3]) {
//			if(velY > 0) velY -= _dcc;
//			else if(velY < 0) velY += _dcc;
//		}
//		
//		velX = clamp(velX, 2, -2);
//		velY = clamp(velY, 2, -2);
	}
	
	private float clamp(float value, float max, float min) {
		if(value >= max) value = max;
		else if(value <= min)value = min;
		
		return value;
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect((int)x, (int)y, 32, 32);
		
	}

}
