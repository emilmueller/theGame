
public class Player {
	String name;
	Deck deck;
	Deck hand;
	Library hud;
	
	int ressourcen = 5;
	
	
	public Player(String name){
		this.name=name;
		deck = new Deck();
		hud = new Library();
		hand = new Deck();
	}
	
	
	
}
