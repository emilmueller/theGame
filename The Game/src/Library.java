import java.util.ArrayList;
import java.util.Random;

public class Library {
	
	public Library(){
		characters.add(new Character("Dante", 666, 0001, 6, 66, 6, 66));
		characters.add(new Character("Alessandro", 500, 0002, 6, 99, 20, 100));
		characters.add(new Character("Dominik", 100, 0003, 5, 69, 69, 100));
		
		
		
	}
	
	ArrayList<Character> characters = new ArrayList<Character>();
	
	

	public void add(Character c) {
		characters.add(c);
	}

	public Character getCard(String name) {
		for (Character c : characters) {
			if (c.getName() == name && c.getDrawn()==false) {
				return c;
			}
			c.setDrawn(true);
		}
		return null;
	}
	
}