import java.util.ArrayList;
import java.util.Random;

public class Library {
	
	private ArrayList<Card> cards = new ArrayList<Card>();

	public Library(){
		cards.add(new Character("Dante", 666, 0001, 6, 66, 6, 66));
		cards.add(new Character("Alessandro", 500, 0002, 6, 99, 20, 100));
		cards.add(new Character("Dominik", 100, 0003, 5, 69, 69, 100));
		
		
	}
	
	public int getSize(){
		return(cards.size());
	}
     

	public void add(Card c) {
		cards.add(c);
	}
	public Card getCardIndex(int i){
		return(cards.get(i));
	}

	public Card getCard(String name) {
		for (Card c : cards) {
			if (c.getName() == name && c.getDrawn()==false) {
				return c;
			}
			c.setDrawn(true);
		}
		return null;
	}
	
}