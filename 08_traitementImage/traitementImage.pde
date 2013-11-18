PImage ron; 
PImage espace;
PImage cognard;
float posXc, posYc, vXc, vYc; 
int largeur;
int hauteur;


void setup(){
	size(800, 600);
	espace = loadImage("espace.jpg");
	ron = loadImage("ron.png");
	cognard = loadImage("cognard.png");
	cognard.resize(50,50);
	posXc = width/2;
	posYc = height/2;
	vXc=8;
    vYc=8;
    largeur=10;
    hauteur=10;
}

void draw(){
	imageMode(CORNER);
	image(espace,0,0);
	largeur = int(map(mouseX,0,width,1,100)); // map(observer,min des entrées,max entrées,min sortie,)
	for (int a=0; a<width; a+=largeur){
		copy(a,0,largeur,width,a,int(random(-3,5)),largeur,width); // cf processing librairie
	}
	hauteur = int(map(mouseY,0,height,1,100));
		for(int b=0;b<height;b+=hauteur){
			copy(0,b,width,hauteur,int(random(-3,5)),b,width,hauteur);
		}

	//imageMode(CENTER);
	//image(ron,mouseX,mouseY);
    
    /*cognard deplacement

	posXc -= vXc;
    posYc -= vYc;
    imageMode(CENTER);
    image(cognard,posXc,posYc);

   	if (posXc>800) {
    vXc*=-1;
   	}
  	if (posYc>600) {
    vYc*=-1;
  	}
  	if (posXc<0) {
    vXc*=-1;
  	}
  	if (posYc<0) {
    vYc*=-1;
  	}*/
  	/*taper dans cognard
  	println(mouseY);
    println(a);
  	if (posYc == mouseY){
  		//vXc*=-1;
  		//vYc*=-1;
  		
  		println("ok");
  		
   	}*/

}