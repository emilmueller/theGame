import processing.core.PApplet;
import processing.core.PImage;

public class Playground extends PApplet {

	int x=960;
	int y=540;
	int x1=6;
	int y1=7;
	int [][] playground = new int[x1][y1];

	
	public void setup () {
		size(x,y);
		
	}
	public void draw () {
		
		PImage pg;
		pg = loadImage("img/pg.jpg");
		pg.resize(x,y);
		background(pg);
		
	}
}
