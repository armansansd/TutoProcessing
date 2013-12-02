PImage cool; 

void setup(){
	size(600,600);
	cool = loadImage("coolBig.png");
}

void draw(){
	image(cool, 0,0);
}