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

public class pushPop extends PApplet {

float r =0; //  rotation
float r2 =0; 

public void setup(){http://culture.samples.fr/
	size(1000,1000);
	background(255);
	rectMode(CENTER);
}

public void draw(){
	//noFill();
	stroke(0,0,255);

	translate(width/2,height/2); // met au milieu le rep\u00e8re sans le remettre \u00e0 0
	rotate(r);	// tourne le rep\u00e8re
	translate(200,0); // translation du rep\u00e8re suivant son abscisse (ayant tourn\u00e9e de r)
	ellipse(0, 0, 50, 50); // dessine l'ellipse
	

	pushMatrix(); //d\u00e9colle la matrice
	rotate(r2); // tourne la matrice
	translate(50,0); // translation de 50 en abscisse
	rect(0, 0, 20, 20);//dessiner un rect \u00e0 partir du centre(cf plus haut)
	popMatrix();// repositioner la matrice \u00e0 la position pr\u00e9c\u00e9dente

	//etc

	pushMatrix();
	rotate(r);
	translate(100,0);
	rect(0, 0, 100, 20);
	popMatrix();

	r+=.01f;
	r2+=.05f;

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "pushPop" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
