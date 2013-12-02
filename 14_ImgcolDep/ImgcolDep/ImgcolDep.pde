import processing.pdf.*;

color cooler ;
PImage cool; 
int posX = 0;
int posY = 0;
float r;

float pX1, pY1 ;

void setup(){
	size(600,600);
	cool = loadImage("cool.png");
	//noLoop();
	noStroke();
	cool.resize(100,100);
}

void draw(){
	background(255);
	
	for(int a=1;a<100;a++){
		for(int b=1;b<100;b++){
			cooler = cool.get(a,b);
			posX = a*6;
			posY = b*6;
			pushMatrix();
			translate(posX, posY);
			fill(cooler);

			for(int c=0; c<50; c++){
				ellipse(pX1,pY1, 3, 3);
				pX1 += int(random (-2,2));
				pY1 += int(random(-2,2));

			}
			popMatrix();
		}
			

	}
		
}