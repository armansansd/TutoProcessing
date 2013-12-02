PImage cool; 
color cooleur;
int posX = 0;
int posY = 0;
float angle;

void setup(){
	size(600,600);
	cool = loadImage("cool.png");
	cool.resize(100,100);
	//noLoop();
	noStroke();
	rectMode(CENTER);
}

void draw(){
	background(255);
	
	for(int a=1;a<100;a++){
		for(int b=1;b<100;b++){
			cooleur = cool.get(a,b);
			//println(cooleur);
			posX = a*6;
			posY = b*6;
			pushMatrix();
			translate(posX, posY);
			rotate(angle);
			stroke(cooleur);
			line(0, 0,20, 0);				
			popMatrix();
			//ellipse(posX,posY,random(4,20),random(4,20));
			 angle += 0.01;
		}
		
	}

	//image(cool, 0,0);
}