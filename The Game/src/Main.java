
public class Main {
	
	public static void main(String[] args) {
		
		
		
		Player player1 = new Player("Spieler 1");
		
		//player1.
		
		//System.out.println("First charakter in deck: " + player1.deck.charakter.get(0).name);
        System.out.println("HAND");
        System.out.println("--------");
		
		player1.hand.add(player1.deck.getRandom());
		player1.hand.add(player1.deck.getRandom());
		player1.hand.add(player1.deck.getRandom());
		
	
        player1.hand.print();
		
		
		Character assassinDante = new Character ("Dante", 666, 0001, 6, 66, 6, 66);
		Character deathScytheAlessandro = new Character ("Alessandro", 500, 0002, 6, 99, 20, 100);
        Character picosBoyfriendDominik = new Character ("Dominik", 100, 0003, 5, 69, 69, 100);
	}

}
