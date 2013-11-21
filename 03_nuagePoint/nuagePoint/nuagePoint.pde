int nbForme =20;

float[] posX = new float [nbForme];
float[] posY = new float [nbForme];
float[] vX = new float [nbForme];

void setup() {
  //background(255);
  size(800, 600);
  smooth();


  for (int i=0; i<nbForme; i++) {
    posY[i] =random(600);
    vX[i] =random(2, 5);
  }
  //frameRate(3);
}

void draw() {
  fill(255,40);
  rect(0, 0, width, height);
  //fill(255, 30);
  //rect(0, 0, width, height);
  fill(123, 200, 180);
  for (int i=0; i<nbForme-1; i++) {
    stroke(0);
    line(posX[i], posY[i], posX[i+1], posY[i+1]);
  }
  for (int i=0;i<nbForme; i++) {

    posX[i] += vX[i];
    noStroke();
    ellipse(posX[i], posY[i], 30, 30);
  }


  for ( int i=0;i<nbForme; i++) {
    if (posX[i]>800) {
      posX[i] = 0;
    }
  }
}

