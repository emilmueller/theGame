
public class Main {
	
	public static void main(String[] args) {
		
		
		
		Player player1 = new Player("Spieler 1");
		
		//player1.
		
		//System.out.println("First character in deck: " + player1.deck.charakter.get(0).name);
        System.out.println("HAND");
        System.out.println("--------");
		
        
        for(int i = 0; i < player1.getLibrarySize() ; i++){
        player1.deck.add(player1.getCard(i));
        }
        
        
		player1.hand.add(player1.deck.getRandom());
		player1.hand.add(player1.deck.getRandom());
		player1.hand.add(player1.deck.getRandom());
		
		
		
	
        player1.hand.print();
		
		
		
	}

}
