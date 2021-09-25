color bgColor = color(200, 200, 200);
float circleSize = 10;
float x = 0;
float y = 0;

void setup() {
  size(600, 600, P2D);
  background(bgColor);
}

void draw() {  
  if (mousePressed) {
    ellipseMode(CENTER);
    fill(200, 10, 10);
    stroke(0, 255, 0);
    line(mouseX, mouseY, pmouseX, pmouseY);
    rect(mouseX, mouseY, circleSize, circleSize);
  }
  if (mousePressed) {
    ellipse(y++, width/2, 20, 20);
    fill(250, 120, 0);
    stroke(100, 120, 100);
  }
  if (mousePressed) {
    ellipse(x++, height/5, 20, 20);
    fill(100, 120, 100);
    stroke(100,120,100);
  }
}
