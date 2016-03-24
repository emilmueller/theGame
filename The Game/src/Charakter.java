public class Charakter extends card {
	private int dmg; //damage
	private int hp; //health
	private int spawn; //army spawning
	private int reg; //army regeneragtion
	private int nom; //Nummer des Charakters
	private int pic; //Bild 

	public Charakter(int dmg, int hp,int reg,int spawn){
		
		this.dmg=dmg;
		this.hp=hp;
		this.reg=reg;
		this.spawn=spawn;
		
		
		
	}


	public String getName(){
		return this.name;
	
		
	}
}
