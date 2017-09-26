import java.awt.Color;
import java.awt.Graphics;

public class Dinosaur extends GameObject {
	int speed;
	static final int maxHeight = 80;
	static boolean reachedTop = false;
	static boolean onGround = true;
	public Dinosaur(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
	}
	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect(x, GamePanel.dinosaurY, width, height);
	}
	void update() { 
		if (!onGround()){
			GamePanel.dinosaurY += 2;
		}
	}
	void jump() {
		GamePanel.dinosaurY -= 10;
	}
	boolean onGround(){
		return ((GamePanel.dinosaurY + height) == NoInternet.height);
	}
}
