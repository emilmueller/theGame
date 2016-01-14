import processing.core.PApplet;

public class Spielfeld extends PApplet {
	//Instanz-Felder
	String name;
	int y; //y-Ausdehnung(rechts-links)
	int x; //x-Ausdhnung(hinten-vorne)
	int z; //z-Ausdehnung("Dicke")
	
	//Konstruktor
	public Feld(String name, int x, int y, int z){
		this.name=name;
		this.x=x;
		this.y=y;
		this.z=z;
	
	}
}
