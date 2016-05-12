import java.util.ArrayList;
import java.util.Random;

public class Deck {
	public Deck() {
	}
	
	public void add(Charakter c) {
		charakter.add(c);
		
		
	}

	ArrayList<Charakter> charakter = new ArrayList<Charakter>();

	public Charakter getCard(String name) {
		
		for (Charakter c : charakter) {
			if (c.name == name) {
				return c;
			}
		}
		return null;
	}

	public void print() {
		for (Charakter c : charakter) {
			System.out.println("__________________");
			System.out.println(c.name);
			System.out.println("Damage: " + c.damage);
			System.out.println("Health: " + c.health);
			System.out.println("Army-Spawn: " + c.spawn);
			System.out.println("Health-Regen.: " + c.regeneration);
			System.out.println("__________________");
		
		}
		
	}
	public Charakter getRandom(){
		int index = new Random().nextInt(charakter.size()); 
		return charakter.get(index);
	}
}
