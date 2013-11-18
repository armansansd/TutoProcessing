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

public class traitementImage extends PApplet {

PImage ron; 
PImage espace;
PImage cognard;
float posXc, posYc, vXc, vYc; 
int largeur;
int hauteur;


public void setup(){
	size(800, 600);
	espace = loadImage("espace.jpg");
	ron = loadImage("ron.png");
	cognard = loadImage("cognard.png");
	cognard.resize(50,50);
	posXc = width/2;
	posYc = height/2;
	vXc=8;
    vYc=8;
    largeur=10;
    hauteur=10;
}

public void draw(){
	imageMode(CORNER);
	image(espace,0,0);
	largeur = PApplet.parseInt(map(mouseX,0,width,1,100));
	for (int a=0; a<width; a+=largeur){
		copy(a,0,largeur,width,a,PApplet.parseInt(random(-3,5)),largeur,width);
	}
	hauteur = PApplet.parseInt(map(mouseY,0,height,1,100));
		for(int b=0;b<height;b+=hauteur){
			copy(0,b,width,hauteur,PApplet.parseInt(random(-3,5)),b,width,hauteur);
		}

	//imageMode(CENTER);
	//image(ron,mouseX,mouseY);
    
    /*cognard deplacement

	posXc -= vXc;
    posYc -= vYc;
    imageMode(CENTER);
    image(cognard,posXc,posYc);

   	if (posXc>800) {
    vXc*=-1;
   	}
  	if (posYc>600) {
    vYc*=-1;
  	}
  	if (posXc<0) {
    vXc*=-1;
  	}
  	if (posYc<0) {
    vYc*=-1;
  	}*/
  	/*taper dans cognard
  	println(mouseY);
    println(a);
  	if (posYc == mouseY){
  		//vXc*=-1;
  		//vYc*=-1;
  		
  		println("ok");
  		
   	}*/

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "traitementImage" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
