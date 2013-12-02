import processing.pdf.*;

color cooler ;
PImage cool; 
int posX = 0;
int posY = 0;
float r;

void setup(){
	size(600,600);
	cool = loadImage("cool.png");
	noLoop();
	noStroke();
	cool.resize(100,100);
}

void draw(){
	background(255);
	
	for(int a=1;a<100;a++){
		for(int b=1;b<100;b++){
			cooler = cool.get(a,b);
			//float brightImg = brightness(cooler);
			//println(brightImg);
			posX = a*6;
			posY = b*6;

			pushMatrix();
			translate(posX, posY);
			//rotate(r);
			//rotate(map(brightImg,0,255,0,TWO_PI));
			fill(cooler);
			ellipse(0, 0, 30, 30);
			popMatrix();
		}
			

	}
		
}