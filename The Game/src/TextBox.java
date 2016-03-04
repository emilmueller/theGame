import processing.core.PFont;

public class TextBox {

	String text;
	int x;
	int y;
	int size;
	PFont f;

	


	static void show(String text, int x, int y, int size){
		background(130);
		stroke();
		rect(x, y);
		text(text);
		
	}
}
