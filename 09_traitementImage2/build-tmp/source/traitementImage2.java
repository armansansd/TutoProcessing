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

public class traitementImage2 extends PApplet {

PImage espace;
PImage boule;
int posY;
public void setup(){
	size(800, 600);
	espace = loadImage("espace.jpg");
	boule = loadImage("souafle.jpg");
	boule.resize(800,600);


	
}

public void draw(){
	image(espace,0,0);
	int largeur = PApplet.parseInt(random(width)); //int(map(mouseX,0,width,1,100));
	for(int a=largeur; a<width;a+=largeur*2){
		for(int b=largeur; b<height; b+=largeur*2){
			/*if (int(random(2)) == 0){
			posY ++;
	
		}else{
			posY --;
		}*/
	copy(boule,a,b,largeur,largeur,a,b,largeur,largeur);
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "traitementImage2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
