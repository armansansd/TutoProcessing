PImage jayZ;
color couleur;
float distance;
float lumin;
int pix = 0;
ArrayList posX = new  ArrayList();
 ArrayList posY= new  ArrayList();
int compteur;

void setup(){
	size(550,700);
	jayZ = loadImage("jayz.png");
	background(0);
	noLoop();
	noStroke();
	//posX[] = 
}

void draw(){
	//image(jayZ,0,0);
	for(int a=0 ; a<550;a++){
		for(int b= 0; b<700;b++){
			couleur = jayZ.get(a,b);
			lumin = brightness(couleur);
			//println(lumin);
			if(lumin==150){
		
				posX.add(a);
				posY.add(b);
				compteur ++;

				

				//fill(255);		
				//ellipse(posX[a], posY[b],10, 10);
				//line(posX[a], posY[b], posX[a-1], posY[b-1]);
			}
		}
	}
	//println(compteur);
	//println(posX);
	stroke(255);
	strokeWeight(1);
	for( int a = 0; a<1000;a++){
		int quelval = int(random(posX.size())); 
		posX.remove(quelval);
		posY.remove(quelval);

	}
	for(int a = 0; a<posX.size()-1; a++){
		for(int b=a; b<posX.size()-1; b++){
			line(float(posX.get(a)),float(posY.get(a)) , float(posX.get(b)), float(posY.get(b)));
		}	
	}
}
