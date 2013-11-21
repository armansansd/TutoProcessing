//float[] pX1 = new float[10];
//float[] vX1 =new float[10];
float pX1, pY1, posXOld, posYOld ;
int d =0;

void setup(){
	size(1000,1000);
	background(0);
	pX1 = width/2;
	pY1 = height/2;
	posYOld = pY1;
	posXOld = pX1;
}

void draw(){
	//background(255);
	pX1 += int(random (-2,2))*30;
	pY1 += int(random(-2,2))*30;
	pX1 = constrain(pX1, 0, width);
	pY1 = constrain(pY1,0, height);
	//println(pX1);
	//stroke(random(255),random(255),random(255));
	line(posXOld, posYOld, pX1, pY1);
	posYOld = pY1;
	posXOld = pX1;

	if(int(random(50)) == 0){
	noFill();
	stroke(random(255),random(255),random(255));
		if(int(random(2)) == 0){
			d = 20 ;
		}else{
			fill(random(255),0,0,random(155,255));
			d = 40;
		}

		ellipse(pX1, pY1, d, d);
	}

}