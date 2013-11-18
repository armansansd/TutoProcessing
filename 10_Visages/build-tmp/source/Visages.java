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

public class Visages extends PApplet {

int nbImages = 4;
int l = 120; 
int h= 150;
PImage tete[] = new PImage[nbImages];
PImage yeux[] = new PImage[nbImages];
PImage nez[] = new PImage[nbImages];
PImage bouche[] = new PImage[nbImages];


public void setup(){
	size(800,600);

	for(int i=0; i<nbImages; i++){
		
		tete[i] = loadImage ("tete0"+i+".png"); //\u00e9cris le nom "tete0" et ajoute "i" puis \u00e9cris ".png" 
		nez[i] = loadImage ("nez0"+i+".png");
		bouche[i] = loadImage ("bouche0"+i+".png");
		yeux[i] = loadImage ("yeux0"+i+".png");
		
		bouche[i].resize(l,h);
		yeux[i].resize(l,h);
		nez[i].resize(l,h);
		tete[i].resize(l,h);
		}

	noLoop();
	imageMode(CENTER);
}

public void draw(){
	
	background(30,227,153);
   	
	for(int i=40; i<width; i+=100){
		for( int j=60; j<height;j+=100){
		tint(random(255));
		image(tete[PApplet.parseInt(random(nbImages))], i, j);
		image(nez[PApplet.parseInt(random(nbImages))], i, j);
		image(bouche[PApplet.parseInt(random(nbImages))], i, j);
		image(yeux[PApplet.parseInt(random(nbImages))], i, j);
		}
	}
}

public void keyPressed(){
	redraw();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Visages" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}