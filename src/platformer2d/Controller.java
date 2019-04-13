package platformer2d;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//Controller is the class that handles on the user inputs - PF

public class Controller implements KeyListener {

	private Model model;
	private View view;
	private Player player;
	
	public Controller(Model m, View v) {		
	
		//Store model and view
		model = m;
		view = v;
		
		
		//View must get this as a key controller
		//Allows controller to handle user inputs when view is in focus
		v.addKeyListener(this);
		
		
		//Store Player(s)
		player = model.getPlayer();
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		//When key is pressed get key code and run through a switch statement
		switch (e.getKeyCode()) {
			case KeyEvent.VK_W: player.moveUp();
			
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
