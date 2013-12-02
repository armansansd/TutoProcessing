PImage portrait;
color couleur;
float posX, posY;
int g = 20; //coef d'aggrandissement
void setup(){
	size(90*g,50*g);
	portrait = loadImage("portrait.jpg");
	noLoop();
	noStroke();
}

void draw(){
	for (int a=0; a<90; a++){
		for(int b=0; b<50; b++){
			couleur = portrait.get(a,b);
			posX = a*g;
			posY = b*g;
			pushMatrix();
			translate(posX, posY);
			fill(couleur);
			//rect(0, 0, 5, 5);
			triangle();			
			popMatrix();
		}
	}
	//image(portrait,0,0);
}