public class Character extends Card {
	public int damage; //damage
	public int health; //health
	public int spawn; //army spawning
	public int regeneration; //army regeneragtion
	public int picture; //Bild 
	public boolean drawn;

	public Character (String name, int cost, int number, int damage, int health, int regeneration, int spawn){
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
