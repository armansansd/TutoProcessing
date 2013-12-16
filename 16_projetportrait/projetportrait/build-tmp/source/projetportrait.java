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

public class projetportrait extends PApplet {

PImage jayZ;
int couleur;
float distance;
float lumin;
int pix = 0;
ArrayList posX = new  ArrayList();
 ArrayList posY= new  ArrayList();
int compteur;

public void setup(){
	size(550,700);
	jayZ = loadImage("jayz.png");
	background(0);
	noLoop();
	noStroke();
	//posX[] = 
}

public void draw(){
	//image(jayZ,0,0);
	for(int a=0 ; a<550;a++){
		for(int b= 0; b<700;b++){
			couleur = jayZ.get(a,b);
			lumin = brightness(couleur);
			//println(lumin);
			if(lumin==150){
		
				posX.add(a);
				posY.add(b);
				compteur ++;

				

				//fill(255);		
				//ellipse(posX[a], posY[b],10, 10);
				//line(posX[a], posY[b], posX[a-1], posY[b-1]);
			}
		}
	}
	//println(compteur);
	//println(posX);
	stroke(255);
	strokeWeight(1);
	for( int a = 0; a<1000;a++){
		int quelval = PApplet.parseInt(random(posX.size())); 
		posX.remove(quelval);
		posY.remove(quelval);

	}
	for(int a = 0; a<posX.size()-1; a++){
		for(int b=a; b<posX.size()-1; b++){
			line(PApplet.parseFloat(posX.get(a)),PApplet.parseFloat(posY.get(a)) , PApplet.parseFloat(posX.get(b)), PApplet.parseFloat(posY.get(b)));
		}	
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "projetportrait" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
