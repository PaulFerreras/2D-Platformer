package platformer2d;

//Model holds all of the model values (i.e. players, enemies, map and their calcuations etc..) - PF

public class Model {

	private Player player;
	
	public Model() {
		
		//Create our player
		player = new Player();
	}

	public Player getPlayer() {
		return player;
	}
	
}
