import processing.core.PApplet;
import processing.core.PFont;

public class HUD extends PApplet {
	int x;
	int y;
	int Buttonx;
	int Buttony;
	int Setx;
	int Sety;
	TextBox textbox = new TextBox(this);
	PFont f;
	
	public static void main(String[] args) {
	

	}
	public void setup(){
		size(x, y);
		frameRate(20);
		f = createFont("Arial",16,true);
	}
	public void draw(){
		textbox.write(text, Setx, Buttony, size);


	}
}
