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

public class rotateHead extends PApplet {

float r, r2;
PImage griffin, griffin2;

public void setup(){
	size(1000,1000);
	griffin = loadImage("griffinCool.png");
	griffin2 = loadImage("griffinBlue.png");
	r = 0;
	r2 = 0;
	griffin.resize(50,50);
	//background(180,150,0);
}

public void draw(){
	fill(255,50);
	noStroke();
	rect(0,0,1000,1000);

	pushMatrix();
	translate(width/2+400,height/2);
	rotate(r);
	image(griffin, 100,0);
	popMatrix();

	pushMatrix();
	translate(width/2-400,height/2);
	rotate(r2);
	image(griffin2, 100,0);
	popMatrix();



r += .05f;
r2 -= 0.05f;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "rotateHead" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
