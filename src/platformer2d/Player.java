package platformer2d;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

//Player holds all the values and information to paint the player - PF

public class Player {

	private int x, y, 
				width = 5, 
				height = 5;
	private Color color = Color.RED;
	
	public Player() {
		
		
		//Set Player Origin
		x = 100;
		y = 100;
	}
	
	
	//Set of commands to move player directionally
	public void moveUp() {
		y++;
		
		System.out.println("Player moved up");
	}
	
	public void moveDown() {
		y--;
	}
	
	public void moveLeft() {
		x--;
	}
	
	public void moveRight() {
		x++;
	}
	
	
	//Paints player
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setBackground(color);
		g2.fillRect(x, y, width, height);
	}
	
}
