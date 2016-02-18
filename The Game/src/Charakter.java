public class Charakter {
	private String name;
	private int dmg; //damage
	private int hp; //health
	private int cost; //cost
	private int spawn = 100; //army spawning
	private int reg; //army regeneragtion
	private int no; //Nummer des Charakters

	public Charakter(String name, int dmg, int hp, int cost ,int reg, int No){
		this.name=name;
		this.dmg=dmg;
		this.hp=hp;
		this.cost=cost;
		this.reg=reg;
		this.no=no;
	}


	public String getName(){
		return this.name;
	}
}
