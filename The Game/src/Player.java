
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
	
	public int getLibrarySize(){
		return(this.library.getSize());
	}
	public Card getCard(int i){
		return(library.getCardIndex(i));
	}
	
}
