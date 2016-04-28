import java.util.ArrayList;

public class Hud {
	ArrayList<Charakter> charakter = new ArrayList<Charakter>();

	public void add(Charakter c) {
		charakter.add(c);
	}

	public Charakter getCard(String name) {
		for (Charakter c : charakter) {
			if (c.name == name) {
				return c;
			}
		}
		return null;
	}
}