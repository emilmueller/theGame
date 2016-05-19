import java.util.ArrayList;
import java.util.Random;

public class Hud {
	ArrayList<Character> charakter = new ArrayList<Character>();

	public void add(Character c) {
		charakter.add(c);
	}

	public Character getCard(String name) {
		for (Character c : charakter) {
			if (c.getName() == name) {
				return c;
			}
		}
		return null;
	}
	
}