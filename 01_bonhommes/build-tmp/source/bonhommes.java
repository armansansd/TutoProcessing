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

public class bonhommes extends PApplet {

int nbImages = 4;
PShape corp[] = new PShape[nbImages];
PShape visage[] = new PShape[nbImages];
PShape jambe[] = new PShape[nbImages];
PShape bras[] = new PShape[nbImages];
PFont font;
String[] fontList =PFont.list();
String syllabe[] = {"PU","PO","PA","PAR","LA","LO","MI","KO","NI","FAI"};
//syllabe[] += {"CHOU"}; //si besoin d'une deuxieme ligne
String name ;
int nbSyllabe;


public void setup(){
	size(1920,768);

	for(int i=0; i<nbImages; i++){
		
		corp[i] = loadShape ("corps0"+i+".svg"); //\u00e9cris le nom "tete0" et ajoute "i" puis \u00e9cris ".png" 
		visage[i] = loadShape ("visage0"+i+".svg");
		jambe[i] = loadShape("jambe0"+i+".svg");
		bras[i] = loadShape ("bras0"+i+".svg");
		corp[i].disableStyle();
		jambe[i].disableStyle();   // Ignore the colors in the SVG
		visage[i].disableStyle(); 
		bras[i].disableStyle();

		font = createFont("Fairplex Wide Black Italic",10);
	 	}


	noLoop();
	shapeMode(CENTER);
}

public void draw(){

		background(30,227,153);
		fill(round(random(255)),round(random(255)),round(random(255)));
		noStroke();

	    //println(fontList);
		textFont(font , 120);
		nbSyllabe = PApplet.parseInt(random(4,6));
		name="";
		for (int a=0 ; a<nbSyllabe;a++){
		name += syllabe[PApplet.parseInt(random(syllabe.length))]; ///choisi le nombre de syllable suivant le nombre de syllable rentr\u00e9 >>.length
		} 
		text(name, 120, 120);
		

		shape(corp[PApplet.parseInt(random(nbImages))], width/2,height/2);
		shape(visage[PApplet.parseInt(random(nbImages))], width/2,height/2);
		shape(jambe[PApplet.parseInt(random(nbImages))], width/2,height/2);
		shape(bras[PApplet.parseInt(random(nbImages))], width/2,height/2);
		
}

public void keyPressed(){
	redraw();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "bonhommes" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
