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

public class projetPortrait extends PApplet {

int maCouleur;
int c;
PImage monImage;
float distance;
float maLuminosite;
int compteur = 0;
IntList posX = new IntList();
IntList posY = new IntList();
int quellePosition;
int nbPoints;


public void setup() {
  size(1000, 1000);
  monImage = loadImage("AugusteLuchet.jpg");
  // Rempli les tableau posX et posY;
  for (int a=1; a<monImage.width; a++) {
    for (int b=1; b<monImage.height; b++) {
      maCouleur = monImage.get(a, b);
      maLuminosite = brightness(maCouleur);
      
      // teste la luminosite du certaine valeur
      // 60 ou 235 - 215
      if (maLuminosite == 12) {
        posX.append(a);
        posY.append(b);
      }
    }
  }
  println(posX.size());// = taille du tableau
  // Test si le tableau contient plus de 100 \u00e9l\u00e9ments
  //(on supprime al\u00e9atoirement le maximum de point sauf 100)
  if (posX.size() > 100){
   nbPoints = posX.size()-1000;
  }else{
    nbPoints = posX.size();
  }
  // Supprime des \u00e9l\u00e9ments des tableau posX et posY;
  // pour garder moins de 100 \u00e9l\u00e9ments
  for (int a=1; a<nbPoints; a++) {
    quellePosition = PApplet.parseInt(random(posX.size()));
    posX.remove(quellePosition);
    posY.remove(quellePosition);
  }


  // Initialise les parametres de dessin
  noLoop();
  smooth();
  strokeWeight(.1f);
  stroke(0,50);
  background(255);
  // affiche l'image
  //image(monImage,0,0);
}


public void draw() {

  for (int a=1; a<posX.size(); a++) {
    for (int b=0; b<posY.size(); b++) {
      line(posX.get(a),posY.get(a), posX.get(b), posY.get(b));
      
    }
  }
}

public void mouseDragged() {

  //  maCouleur = monImage.get(mouseX,mouseY);
  //  stroke(maCouleur,150);
  //  distance = dist(mouseX, mouseY, pmouseX, pmouseY);
  //  strokeWeight(distance+3);
  //  line(mouseX, mouseY, pmouseX, pmouseY);
  //  //triangle(mouseX,pmouseY,pmouseX+random(40),mouseY,pmouseX,pmouseY+random(40));
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "projetPortrait" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
