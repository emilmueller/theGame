import processing.core.PFont;
import processing.core.PApplet;

public class TextBox {

	String text;
	int x;
	int y;
	int size;
	PFont f;
	GraphicHud uiBuilder;

	


	public TextBox(GraphicHud hud) {
		uiBuilder = hud;
	}




	void write(String text, int x, int y, int size){
		
		uiBuilder.background(130);
		/*stroke(5);
		rect(x, y);
		text(text);*/
		
	}
}
