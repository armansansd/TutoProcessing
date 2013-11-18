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

public class nuagePoint extends PApplet {

int nbForme =20;

float[] posX = new float [nbForme];
float[] posY = new float [nbForme];
float[] vX = new float [nbForme];

public void setup() {
  //background(255);
  size(800, 600);
  smooth();


  for (int i=0; i<nbForme; i++) {
    posY[i] =random(600);
    vX[i] =random(2, 5);
  }
  //frameRate(3);
}

public void draw() {
  fill(255,40);
  rect(0, 0, width, height);
  //fill(255, 30);
  //rect(0, 0, width, height);
  fill(123, 200, 180);
  for (int i=0; i<nbForme-1; i++) {
    stroke(0);
    line(posX[i], posY[i], posX[i+1], posY[i+1]);
  }
  for (int i=0;i<nbForme; i++) {

    posX[i] += vX[i];
    noStroke();
    ellipse(posX[i], posY[i], 30, 30);
  }


  for ( int i=0;i<nbForme; i++) {
    if (posX[i]>800) {
      posX[i] = 0;
    }
  }
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "nuagePoint" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
