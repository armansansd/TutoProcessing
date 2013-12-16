float r, r2;
PImage griffin, griffin2;

void setup(){
	size(1000,1000);
	griffin = loadImage("griffinCool.png");
	griffin2 = loadImage("griffinBlue.png");
	r = 0;
	r2 = 0;
	griffin.resize(50,50);
	//background(180,150,0);
}

void draw(){
	fill(255,50);
	noStroke();
	rect(0,0,1000,1000);

	pushMatrix();
	translate(width/2+400,height/2);
	rotate(r);
	image(griffin, 100,0);
	popMatrix();

	pushMatrix();
	translate(width/2-400,height/2);
	rotate(r2);
	image(griffin2, 100,0);
	popMatrix();



r += .05;
r2 -= 0.05;
}