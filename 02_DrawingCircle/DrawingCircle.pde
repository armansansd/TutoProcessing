int d =0;
int r =0;
int v =0;
int b =0;
float tourner;

PImage mignon;

void setup() {
  size(800, 600);
  mignon = loadImage("tete.png");
  noFill();
  background(255);
  d=50;
  imageMode(CENTER);
}

void draw() {
  //background(255);
  //if (i == 1) { 
  //save("cercle.tif");   
  //}
  pushMatrix();
  translate(mouseX, mouseY);
  rotate(tourner);
  if (mousePressed == true) { 
  ellipse(0, 0, d, d);

    image(mignon, 0, 0);
  }
  popMatrix();
  tourner += .1;

  r =round(random(255));
  v=round(random (255));
  b=round(random (255));
}

void keyPressed() {
  if (key == '+') {
    d += 1;
  } 
  if (key == '-') {
    d-=1;
  }
  if (key == 'r') {
    tint(r, 0, 0);
  }
  if (key == 'v') {
    tint(r, v, 0);
  }
  if (key == 'b') {
    tint(r, v, b);
  }
  if (key == 'e') {
    background(255);
  }
  if (key == 's') {
    save("cercle.tif");
  }
}

