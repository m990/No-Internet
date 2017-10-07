import java.awt.Color;
import java.awt.Graphics;

public class Dinosaur extends GameObject {
	int speed;
	public Dinosaur(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	void draw(Graphics g, int y) {
		g.setColor(Color.RED);
		g.drawRect(x, y, width, height);
	}
	void update() { 
		if (!onGround()) {
			System.out.println("In not on ground");
			GamePanel.dinosaurY += 3;
		}
	}
	void jump() {
		if (onGround()) {
			GamePanel.dinosaurY -= 120;
			System.out.println("In on ground");
		}
	}
	boolean onGround() {
		return ((GamePanel.dinosaurY + height + 25) >= NoInternet.height);
	}
}
