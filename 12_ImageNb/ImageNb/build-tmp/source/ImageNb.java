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

public class ImageNb extends PApplet {

PImage relax; 
int cooleur;
int posX = 0;
int posY = 0;
float r;

public void setup(){
	size(600,600);
	relax = loadImage("relax.png");
	//noLoop();
	noStroke();
	rectMode(CENTER);
}

public void draw(){
	background(255);
	
	for(int a=1;a<100;a++){
		for(int b=1;b<100;b++){
			cooleur = relax.get(a,b);
			println(cooleur);
			posX = a*6;
			posY = b*6;
			if(cooleur == -1){
				pushMatrix();
				translate(posX-1, posY-1);
				stroke(255,125,0);
				line(0, 0,20, 0);
				popMatrix();

			}else{
				pushMatrix();
				translate(posX, posY);
				stroke(0);
				line(0, 0,20, 0);
				popMatrix();

			}
			/*
			
			rotate(angle);
			stroke(cooleur);
			 angle += 0.01;*/
		}
		
	}

	//image(cool, 0,0);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ImageNb" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
