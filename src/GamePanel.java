import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import javax.swing.Timer;

import org.omg.CORBA.Current;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	Dinosaur dinosaur;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE  = 2;
	int CURRENT_STATE = MENU_STATE;
<<<<<<< HEAD
<<<<<<< HEAD
	static int dinosaurY = 180;
=======
	static int dinosaurY;
>>>>>>> origin/master
=======
	int dinosaurY;
>>>>>>> parent of 1aa7fbf... Now it jumps, and there are green things
	
	
	// Constructor
	public GamePanel() {
		timer = new Timer(1000/60, this);
<<<<<<< HEAD
<<<<<<< HEAD
		dinosaur = new Dinosaur(50, 165, 100, 100);
		cactus = new Cactus(750, 265, 10, 10);
		cactus1 = new Cactus(1050, 270, 5, 5);
=======
		dinosaur = new Dinosaur(0, 160, 100, 100);
		dinosaurY = 200;
>>>>>>> origin/master
=======
		dinosaur = new Dinosaur(0, 160, 100, 100);
		dinosaurY = 160;
>>>>>>> parent of 1aa7fbf... Now it jumps, and there are green things
	}
	
	
	void startGame() {
		timer.start();
	}
	
	// Later I'll add more states here, but for now this is just the game state
	void drawMenuState(Graphics g) {
		g.setColor(Color.black);
		g.drawString("There is no internet connection", 300, 50);
		g.drawString("•Checking the network cables, modem, and router", 300, 75);
		g.drawString("•Reconnecting to Wi-Fi", 300, 100);
		g.drawString("•Running Network Diagnostics", 300, 125);
	}
	
	void drawGameState(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, NoInternet.width, NoInternet.height);
<<<<<<< HEAD
		dinosaur.draw(g, dinosaurY);
<<<<<<< HEAD
		cactus.draw(g);
		cactus1.draw(g);
=======
		dinosaur.draw(g);
>>>>>>> origin/master
=======
>>>>>>> parent of 1aa7fbf... Now it jumps, and there are green things
	}
	void drawEndState(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString("You lost", 50, 50);
	}
	
	void updateMenuState() {
		
	}
	void updateGameState() {
<<<<<<< HEAD
<<<<<<< HEAD
		dinosaur.update();
		cactus.update();
		cactus1.update();
=======
		if (dinosaur.onGround == false){
			dinosaur.jump();
		}
		dinosaur.update();
>>>>>>> origin/master
=======
		
>>>>>>> parent of 1aa7fbf... Now it jumps, and there are green things
	}
	void updateEndState() {
		
	}
	
	// I don't know what this is for
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.paintImmediately(getBounds());
		if (CURRENT_STATE == MENU_STATE) {
			updateMenuState();
		}
		else if (CURRENT_STATE == GAME_STATE) {
			updateGameState();
		}
		else if (CURRENT_STATE == END_STATE) {
			updateEndState();
		}
	}
	

	// Key listener methods
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		if (CURRENT_STATE == MENU_STATE) {
			drawMenuState(g);
		}
		else if (CURRENT_STATE == GAME_STATE) {
			drawGameState(g);
		}
		else if (CURRENT_STATE == END_STATE) {
			drawEndState(g);
		}
			
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			System.out.println("Enter pressed");
			if (CURRENT_STATE == MENU_STATE) {
				CURRENT_STATE = GAME_STATE;
			}
			else if (CURRENT_STATE == GAME_STATE) {
				CURRENT_STATE = END_STATE;
			}
			else if (CURRENT_STATE == END_STATE) {
				CURRENT_STATE = MENU_STATE;
			}
		}
<<<<<<< HEAD
		if ((e.getKeyCode() == KeyEvent.VK_UP) && (CURRENT_STATE == GAME_STATE)) {
<<<<<<< HEAD
			System.out.println("In jump key pressed thing");
			dinosaur.jump();
=======
		if ((e.getKeyCode() == KeyEvent.VK_UP) && (CURRENT_STATE == GAME_STATE) && (dinosaur.onGround())) {
			System.out.println("Up pressed");
			System.out.println(dinosaurY);
			dinosaur.jump();
			System.out.println(dinosaurY);
>>>>>>> origin/master
=======
			
>>>>>>> parent of 1aa7fbf... Now it jumps, and there are green things
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
