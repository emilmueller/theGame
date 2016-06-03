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
			System.out.println("__________________");
			System.out.println(c.getName());
			System.out.println("Damage: " + c.getDamage());
			System.out.println("Health: " + c.getHealth());
			System.out.println("Army-Spawn: " + c.getSpawn());
			System.out.println("Health-Regen.: " + c.getRegeneration());
			System.out.println("__________________");
		
		}
		
	}
	public Card getRandom(){
		int index = new Random().nextInt(cards.size()); 
		return cards.get(index);
	}
}
