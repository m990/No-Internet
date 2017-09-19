import java.awt.Color;
import java.awt.Graphics;

public class Dinosaur extends GameObject {
	int speed;
	static final int maxHeight = -40;
	public Dinosaur(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
	}
	void draw(Graphics g, int y) {
		g.setColor(Color.RED);
		g.drawRect(x, y, width, height);
	}
	void update() { 
		
	}
	void jump() {
		this.y += 5;
	}
}
