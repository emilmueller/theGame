import processing.core.PApplet;
import processing.core.PFont;

public class HUD extends PApplet {
int x;
int y;
int Buttonx;
int Buttony;
int Setx;
int Sety;
PFont f;
TextBox r ("lol", 5, 5, 5);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	}
	public void setup(){
		size(x, y);
		frameRate(20);
		f = createFont("Arial",16,true);
	}
	public void draw(){
		TextBox.show();
		TextBox("lol", 5, 5, 5).show();
		rect(0,0,x,y);
		rect(10, 10,Setx, Sety);
		
	}
}
