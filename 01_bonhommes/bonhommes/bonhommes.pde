int nbImages = 4;
PShape corp[] = new PShape[nbImages];
PShape visage[] = new PShape[nbImages];
PShape jambe[] = new PShape[nbImages];
PShape bras[] = new PShape[nbImages];
PFont font;
String[] fontList =PFont.list();
String syllabe[] = {"PU","PO","PA","PAR","LA","LO","MI","KO","NI","FAI","BA","TA","BA","FA","LA"};
//syllabe[] += {"CHOU"}; //si besoin d'une deuxieme ligne
String name ;
int nbSyllabe;


void setup(){
	size(1920,768);

	for(int i=0; i<nbImages; i++){
		
		corp[i] = loadShape ("corps0"+i+".svg"); //écris le nom "tete0" et ajoute "i" puis écris ".png" 
		visage[i] = loadShape ("visage0"+i+".svg");
		jambe[i] = loadShape("jambe0"+i+".svg");
		bras[i] = loadShape ("bras0"+i+".svg");
		corp[i].disableStyle();
		jambe[i].disableStyle();   // Ignore the colors in the SVG
		visage[i].disableStyle(); 
		bras[i].disableStyle();

		font = createFont("Fairplex Wide Black Italic",10);
	 	}


	noLoop();
	shapeMode(CENTER);
}

void draw(){

		background(30,227,153);
		fill(round(random(255)),round(random(255)),round(random(255)));
		noStroke();

	    //println(fontList);
		textFont(font , 120);
		nbSyllabe = int(random(4,12));
		name="";
		for (int a=0 ; a<nbSyllabe;a++){
		name += syllabe[int(random(syllabe.length))]; ///choisi le nombre de syllable suivant le nombre de syllable rentré >>.length
		} 
		text(name, 120, 120);
		

		shape(corp[int(random(nbImages))], width/2,height/2);
		shape(visage[int(random(nbImages))], width/2,height/2);
		shape(jambe[int(random(nbImages))], width/2,height/2);
		shape(bras[int(random(nbImages))], width/2,height/2);
		
}

void keyPressed(){
	redraw();
}