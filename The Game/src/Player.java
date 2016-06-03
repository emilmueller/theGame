
public class Player {
	String name;
	Deck deck;
	Deck hand;
	Library library;
	
	int ressourcen = 5;
	
	
	public Player(String name){
		this.name=name;
		deck = new Deck();
		library = new Library();
		hand = new Deck();
	}
	
	
	
}
