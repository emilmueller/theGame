
public class Player {
	String name;
	Deck deck;
	Hud hud;
	
	public Player(String name){
		this.name=name;
		deck = new Deck();
		hud = new Hud();
	}
}
