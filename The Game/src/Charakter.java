public class Charakter extends Card {
	private int damage; //damage
	private int health; //health
	private int spawn; //army spawning
	private int regeneration; //army regeneragtion
	private int picture; //Bild 

	public Charakter (String name, int cost, int number, int damage, int health, int regeneration, int spawn){
		super(name, cost, number);
		
		this.damage=damage;
		this.health=health;
		this.regeneration=regeneration;
		this.spawn=spawn;
		
		
		
	}


	public String getName(){
		return this.name;
	
		
	}
}
