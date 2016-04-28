
public class Main {
	
	public static void main(String[] args) {
		
		Player player1 = new Player("Spieler 1");
		player1.hud.add(new Charakter ("Dante", 666, 0001, 6, 66, 6, 66));
		player1.deck.add(player1.hud.getCard("Dante"));
		System.out.println("First charakter in deck: " + player1.deck.charakter.get(0).name);
        
		Charakter assassinDante = new Charakter ("Dante", 666, 0001, 6, 66, 6, 66);
		Charakter deathScytheAlessandro = new Charakter ("Alessandro", 500, 0002, 6, 99, 20, 100);
        Charakter picosBoyfriendDominik = new Charakter ("Dominik", 100, 0003, 5, 69, 69, 100);
	}

}
