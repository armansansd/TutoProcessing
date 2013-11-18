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

public class test_cercle extends PApplet {

int d ; 
float posX1, posX2, posY1, posY2, vX1, vY1, vX2, vY2;

public void setup() {
  size(800, 600);
  noFill();
  smooth();
  posX1=posX2=width/2;
  posY1=posY2=height/2;
  //vX1=5;
  //vY1=5;
  vX2=8;
  vY2=8;
}




public void draw() {
  fill(0, 50);
  rect(0, 0, width, height);
  pushMatrix();
  translate(width/2, height/2);
  rotate(d);
  stroke(255);
  ellipse(200, 0, 100, 100);
  d +=6;
  popMatrix();
  //posX1 -= vX1;
  //posY1 -= vY1;
  posX2 -= vX2;
  posY2 -= vY2;
  ellipse(mouseX, mouseY, 100, 100);
  ellipse(posX2, posY2, 100, 100);
  stroke(255);
  line(mouseX,mouseY,posX2,posY2);
  line(mouseX,mouseY,width/2,height/2);
  line(width/2,height/2,posX2,posY2);
  
  /*changement de couleur
  float a = width-mouseX;
  float b = ;
  println(b);
  //fin changement couleur*/ 
  
  
  /*if (posX1>800) {
    vX1*=-1;
   
  }
  if (posY1>600) {
    vY1*=-1;
  }
  if (posX1<0) {
    vX1*=-1;
  }
  if (posY1<0) {
    vY1*=-1;
  }*/
   //2e ellipse
   
    if (posX2>800) {
    vX2*=-1;
   
  }
  if (posY2>600) {
    vY2*=-1;
  }
  if (posX2<0) {
    vX2*=-1;
  }
  if (posY2<0) {
    vY2*=-1;
  }
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "test_cercle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
