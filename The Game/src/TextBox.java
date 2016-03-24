import processing.core.PFont;
import processing.core.PApplet;

public class TextBox {

	String text;
	int x;
	int y;
	int size;
	PFont f;

	


	static void write(String text, int x, int y, int size){
		
		background(130);
		stroke();
		rect(x, y);
		text(text);
		
	}
}
