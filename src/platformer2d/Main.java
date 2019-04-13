package platformer2d;

public class Main {

	public static void main(String[] args) {
		
		//Set game is running as true - PF
		boolean game_is_running = true;
		
		
		//Set Frame Rate
		int fps = 2;  //Sets FPS to 60
		double nanosec_per_frame = Math.pow(10, 9)/fps; //Uses Math.pow to get nanoseconds per frame because we are using System.nanoTime();
		
		
		//Uses long since System.nanoTime returns a long value
		long elapsed_time = 0; // Variable used to define how long its been since an update
		long time_since_last_update = 0; //Stores time since last update
		
		
		//Create Model, View, Controller
		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(model, view);
		
		
		//The Game LOOP
		while (game_is_running) {
			
			
			//Calculates the elapsed_time
			elapsed_time = System.nanoTime() - time_since_last_update;
			
			
			//Checks if last time is less than the alloted nanoseconds per frame
			if (elapsed_time >= nanosec_per_frame) {
				time_since_last_update = System.nanoTime(); //Store time since last update
				
				
				view.repaint();
				
			}
			
		}

	}

}
