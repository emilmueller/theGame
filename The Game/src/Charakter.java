public class Charakter extends Card {
	private int damage; //damage
	private int hp; //health
	private int spawn; //army spawning
	private int reg; //army regeneragtion
	private int pic; //Bild 

	public Charakter (String name, String cost, String number, int dmg, int hp, int reg, int spawn){
		super(name, cost, number);
		
		this.damage=dmg;
		this.hp=hp;
		this.reg=reg;
		this.spawn=spawn;
		
		
		
	}


	public String getName(){
		return this.name;
	
		
	}
}
