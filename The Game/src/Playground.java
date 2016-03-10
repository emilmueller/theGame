import processing.core.PApplet;
import processing.core.PImage;

public class Playground extends PApplet {

		
	
	int x=1120;
	int y=630;
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

	public void mouseClicked(){
	
		System.out.println("x:"+mouseX+"-y:"+mouseY);
		if(mouseButton==RIGHT){
			System.out.println("click_right");
		}else{
			System.out.println("click_left");
		}		
		
		
	}
}
