package platformer2d;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

//View paints all of the models in the Model class - PF;

public class View extends JFrame {
	
	//Set width and height of View
	private int width = 1000, height = 500;
	private Model model;
	
	public View(Model m) {
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Closes the application when pressing the X button
		
		
		//Set size of view (preferred for when a layout is set, flowlayout is set for default)
		setPreferredSize(new Dimension(width, height));
		
		
		//Set models
		model = m;
		
		
		//Pack and set visible must be run for Java GUI to appear visible;
		//Pack will pack all of the components to their preferred size
		//Set Visible will make the component visible
		pack();
		setVisible(true);
	}

}
