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
	int dinosaurY;
	
	
	// Constructor
	public GamePanel() {
		timer = new Timer(1000/60, this);
		dinosaur = new Dinosaur(0, 160, 100, 100);
		dinosaurY = 160;
	}
	
	
	void startGame() {
		timer.start();
	}
	
	// Later I'll add more states here, but for now this is just the game state
	void drawMenuState(Graphics g) {
		g.setColor(Color.black);
		g.drawString("There is no internet connection", 300, 50);
	}
	
	void drawGameState(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, NoInternet.width, NoInternet.height);
		dinosaur.draw(g, dinosaurY);
	}
	void drawEndState(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString("You lost", 50, 50);
	}
	
	void updateMenuState() {
		
	}
	void updateGameState() {
		
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
		if ((e.getKeyCode() == KeyEvent.VK_UP) && (CURRENT_STATE == GAME_STATE)) {
			System.out.println("Up pressed");
				dinosaurY -= 20;
				//System.out.println("In the qualifying jump block");
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
