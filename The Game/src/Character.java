public class Character extends Card {
	private int damage; //damage
	


	private int health; //health
	private int spawn; //army spawning
	private int regeneration; //army regeneragtion
	private int picture; //Bild 
	

	public Character (String name, int cost, int number, int damage, int health, int regeneration, int spawn){
		super(name, cost, number, false);
		
		this.damage=damage;
		this.health=health;
		this.regeneration=regeneration;
		this.spawn=spawn;
		
		
		
	}

	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getSpawn() {
		return spawn;
	}


	public void setSpawn(int spawn) {
		this.spawn = spawn;
	}


	public int getRegeneration() {
		return regeneration;
	}


	public void setRegeneration(int regeneration) {
		this.regeneration = regeneration;
	}


	public int getPicture() {
		return picture;
	}


	public void setPicture(int picture) {
		this.picture = picture;
	}


	
}
