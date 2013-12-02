import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class codeImage extends PApplet {

PImage cool; 
int cooleur;
int posX = 0;
int posY = 0;
float angle;

public void setup(){
	size(600,600);
	cool = loadImage("cool.png");
	cool.resize(100,100);
	//noLoop();
	noStroke();
	rectMode(CENTER);
}

public void draw(){
	background(255);
	
	for(int a=1;a<100;a++){
		for(int b=1;b<100;b++){
			cooleur = cool.get(a,b);
			//println(cooleur);
			posX = a*6;
			posY = b*6;
			pushMatrix();
			translate(posX, posY);
			rotate(angle);
			stroke(cooleur);
			line(0, 0,20, 0);				
			popMatrix();
			//ellipse(posX,posY,random(4,20),random(4,20));
			 angle += 0.01f;
		}
		
	}

	//image(cool, 0,0);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "codeImage" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
