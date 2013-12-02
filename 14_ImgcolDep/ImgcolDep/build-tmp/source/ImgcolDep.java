import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.pdf.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class ImgcolDep extends PApplet {



int cooler ;
PImage cool; 
int posX = 0;
int posY = 0;
float r;

float pX1, pY1 ;

public void setup(){
	size(600,600);
	cool = loadImage("cool.png");
	//noLoop();
	noStroke();
	cool.resize(100,100);
}

public void draw(){
	background(255);
	
	for(int a=1;a<100;a++){
		for(int b=1;b<100;b++){
			cooler = cool.get(a,b);
			posX = a*6;
			posY = b*6;
			pushMatrix();
			translate(posX, posY);
			fill(cooler);

			for(int c=0; c<50; c++){
				ellipse(pX1,pY1, 3, 3);
				pX1 += PApplet.parseInt(random (-2,2));
				pY1 += PApplet.parseInt(random(-2,2));

			}
			popMatrix();
		}
			

	}
		
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ImgcolDep" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
