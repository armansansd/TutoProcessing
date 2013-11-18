PImage espace;
PImage boule;
int posY;
void setup(){
	size(800, 600);
	espace = loadImage("espace.jpg");
	boule = loadImage("souafle.jpg");
	boule.resize(800,600);


	
}

void draw(){
	image(espace,0,0);
	int largeur = int(random(width)); //int(map(mouseX,0,width,1,100));
	for(int a=largeur; a<width;a+=largeur*2){
		for(int b=largeur; b<height; b+=largeur*2){
			/*if (int(random(2)) == 0){
			posY ++;
	
		}else{
			posY --;
		}*/
	copy(boule,a,b,largeur,largeur,a,b,largeur,largeur);
		}
	}
}