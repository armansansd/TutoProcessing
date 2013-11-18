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

public class pointAleatoire extends PApplet {

//float[] pX1 = new float[10];
//float[] vX1 =new float[10];
float pX1, pY1, posXOld, posYOld ;
int d =0;

public void setup(){
	size(1000,1000);
	background(0);
	pX1 = width/2;
	pY1 = height/2;
	posYOld = pY1;
	posXOld = pX1;
}

public void draw(){
	//background(255);
	pX1 += PApplet.parseInt(random (-2,2))*30;
	pY1 += PApplet.parseInt(random(-2,2))*30;
	pX1 = constrain(pX1, 0, width);
	pY1 = constrain(pY1,0, height);
	//println(pX1);
	//stroke(random(255),random(255),random(255));
	line(posXOld, posYOld, pX1, pY1);
	posYOld = pY1;
	posXOld = pX1;

	if(PApplet.parseInt(random(50)) == 0){
	noFill();
	stroke(random(255),random(255),random(255));
		if(PApplet.parseInt(random(2)) == 0){
			d = 20 ;
		}else{
			fill(random(255),0,0,random(155,255));
			d = 40;
		}

		ellipse(pX1, pY1, d, d);
	}

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "pointAleatoire" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
