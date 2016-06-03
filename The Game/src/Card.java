public class Card {
	private String name; // Name der Karte

	 private int cost; // Kosten der Karte
	 private int number; // nummer der Karte
	private boolean drawn = false; //Gezogen?


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public boolean getDrawn() {
		return drawn;
	}


	public void setDrawn(boolean drawn) {
		this.drawn = drawn;
	}


	public String getName() {
		return name;
	}


	public int getNumber() {
		return number;
	}


	public Card(String name, int cost, int number, boolean drawn) {

		this.name = name;
		this.cost = cost;
		this.number = number;
		this.drawn = drawn;

	}
}