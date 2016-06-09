import java.util.ArrayList;
import java.util.Random;

public class Deck {
	public Deck() {
	}
	
	public void add(Card c) {
		cards.add(c);
		
		
	}

	ArrayList<Card> cards = new ArrayList<Card>();

	public Card getCard(String name) {
		
		for (Card c : cards) {
			if (c.getName() == name) {
				return c;
			}
		}
		return null;
	}

	public void print() {
		for (Card c : cards) {
			if ( c instanceof Character) {
				Character character = (Character)c;
				System.out.println("__________________");
				System.out.println("Name:" + character.getName());
				System.out.println("Damage:" + character.getDamage());
				System.out.println("Health:" +character.getHealth());
				System.out.println("Army-Regen.: " + character.getRegeneration());
				System.out.println("Army-Spawn: " + character.getSpawn());
				System.out.println("__________________");
			}
			
		
		}
		
	}
	public Card getRandom(){
		int index = new Random().nextInt(cards.size()); 
		Card result = cards.get(index);
		cards.remove(index);
		return result;
	}
}
