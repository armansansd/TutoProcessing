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

public class ProjetCabPortrait extends PApplet {

PImage portrait;
int couleur;
float posX, posY;
int g = 20; //coef d'aggrandissement
public void setup(){
	size(90*g,50*g);
	portrait = loadImage("portrait.jpg");
	noLoop();
	noStroke();
}

public void draw(){
	for (int a=0; a<90; a++){
		for(int b=0; b<50; b++){
			couleur = portrait.get(a,b);
			posX = a*g;
			posY = b*g;
			pushMatrix();
			translate(posX, posY);
			fill(couleur);
			//rect(0, 0, 5, 5);
			triangle();			
			popMatrix();
		}
	}
	//image(portrait,0,0);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ProjetCabPortrait" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
