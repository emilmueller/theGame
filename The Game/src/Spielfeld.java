import processing.core.PApplet;

public class Spielfeld extends PApplet {
	//Instanz-Felder
	String name;
	int y; //y-Ausdehnung(rechts-links)
	int x; //x-Ausdhnung(hinten-vorne)
	int z; //z-Ausdehnung("Dicke")
	int a; //x-Position
	int b; //y-Position
	
	//Konstruktor
	public Spielfeld(String name, int a, int b, int x, int y, int z){
		this.name=name;
		this.x=x;
		this.y=y;
		this.z=z;
		this.a=a;
		this.b=b;
	
	}
	
	public void print(){
		public void setup(){
			frameRate(30);
		}
		public void draw(){
			rect(a+x, b, y, z)
			line
		}
	}
}
