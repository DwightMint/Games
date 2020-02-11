package dungeon;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import dungeon.characters.ID;
import dungeon.display.Handler;
import dungeon.display.KeyInput;
import dungeon.display.Window;
import dungeon.display.graphics.Player;

public class Game extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 1L;
	public static int WIDTH = 800, HEIGHT = 600;
	public String title = "Dungeon Game";
	
	private Thread thread;
	private boolean isRunning = false;
	
	// Instances
	private Handler handler;
	private KeyInput input;

	public Game() {
		new Window(WIDTH, HEIGHT, title, this);
		start();
		init();		
	}
	
	private void init() {
		handler = new Handler();
		input = new KeyInput();
		this.addKeyListener(input);
		
		handler.addObject(new Player(100, 100, ID.Player, input));
	}
	
	private synchronized void start() {
		if(isRunning) return;
		
		thread = new Thread(this);
		thread.start();
		isRunning = true;
	}
	
	private synchronized void stop() {
		if(!isRunning) return;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		isRunning = false;
	}
	
	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 30.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(isRunning){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1){
				tick();
				delta--;
			}
			render();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				frames = 0;
			}
		}
		stop();		
		
	}
	
	private void tick() {
		handler.tick();
	}
	
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.gray);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		handler.render(g);
		
		bs.show();
		g.dispose();
	}
	
	public static void main(String[] args) {
		new Game();
	}

}
