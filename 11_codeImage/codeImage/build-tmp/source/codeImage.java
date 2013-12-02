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

public class codeImage extends PApplet {

PImage cool; 

public void setup(){
	size(600,600);
	cool = loadImage("coolBig.png");
}

public void draw(){
	image(cool, 0,0);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "codeImage" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
