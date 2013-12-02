import processing.pdf.*;

float r =0; //  rotation
float r2 =0; 

void setup(){http://culture.samples.fr/
	size(1000,1000);
	background(255);
	rectMode(CENTER);
	beginRecord(PDF,"coolandtheromy.pdf");
}

void draw(){
	//noFill();
	stroke(0,0,255);

	translate(width/2,height/2); // met au milieu le repère sans le remettre à 0
	rotate(r);	// tourne le repère
	translate(200,0); // translation du repère suivant son abscisse (ayant tournée de r)
	ellipse(0, 0, 50, 50); // dessine l'ellipse
	

	pushMatrix(); //décolle la matrice
	rotate(r2); // tourne la matrice
	translate(50,0); // translation de 50 en abscisse
	rect(0, 0, 20, 20);//dessiner un rect à partir du centre(cf plus haut)
	popMatrix();// repositioner la matrice à la position précédente

	//etc

	pushMatrix();
	rotate(r);
	translate(100,0);
	rect(0, 0, 100, 20);
	popMatrix();

	r+=.01;
	r2+=.05;
 	
 	endRecord();
}