void setup()
{
  size(1300,800);
  background(125);
  fill(255);
  line(1200,200,1200,700);
  frameRate(10000);
}
noStroke();

// position of the car
var x1 = x2 = x3 = 10;
var y1 = y2 = y3 = 300;
// position of the Frog
var x = 900;
var y = 700;
//position of Sun, Cloud
var leftX = 45;
var rightX = 370;
var sunRadius = 100;
draw = function() {

    // all lines of code inside here will be run repeatedly

    background(151, 244, 247);


    fill(156,59,156);
    rect(0,600,1300,400);

    fill(240,232,231);
    rect(1195,200,10,400);

    fill(1,8,1);
    rect(1198,200,3,400);

    drawCar1(x1,y1);
    drawCar2(x2,y2+100);
    drawCar3(x3,y3+200);
    float vx1 = random(0.1,0.3);
    int vy1 = random(-1,1);
    float vx2 = random(0.1,0.3);
    int vy2 = random(-1,1);
    float vx3 = random(0.1,0.3);
    int vy3 = random(-1,1);

    x1 = x1 + vx1 ; y1= y1 +vy1;
    x2 = x2 + vx2; y2= y2 +vy2;
    x3 = x3 + vx3; y3= y3 +vy3;

    if(x1>1100) {
    textSize(30);
    text("CAR NUMBER 1 WIN",500,100);
    exit();
    };
    if (x2>1100){
    textSize(30);
    text("CAR NUMBER 2 WIN",500,100);
    exit();
    };
    if (x3>1100){
    textSize(30);
    text("CAR NUMBER 3 WIN",500,100);
    exit();
    };


    //Froggy
     fill(30, 204, 91); // a nice froggy green!
     ellipse(x, y, 200, 100); // face
     ellipse(x - 50, y - 50, 40, 40); // left eye socket
     ellipse(x + 50, y - 50, 40, 40); // right eye socket

     fill(255, 255, 255); // for the whites of the eyes!
     ellipse(x - 50, y - 50, 30, 30); // left eyeball
     ellipse(x + 50, y - 50, 30, 30); // right eyeball

     fill(5, 5, 5);
     ellipse(x,y,100,30);
     rect(x-55,y-50,10,10);
     rect(x+43,y-50,10,10);


     // Cloud and Sun
         fill(255, 170, 0);
         ellipse(200, 100, sunRadius, sunRadius);

         // clouds
         fill(255, 255, 255);
         // left cloud
         ellipse(leftX, 150, 126, 97);
         ellipse(leftX+62, 150, 70, 60);
         ellipse(leftX-62, 150, 70, 60);
         leftX = leftX + 0.05;
         if(leftX > 400){leftX = 45};

         // right cloud
         ellipse(rightX, 100, 126, 97);
         ellipse(rightX+62, 100, 70, 60);
         ellipse(rightX-62, 100, 70, 60);
         rightX = rightX -0.05;
         if(rightX < 50){rightX = 370};
};

drawCar1 = function(var xPoint, var yPoint){
  // draw the car body
  fill(255, 0, 115);
  rect(xPoint, yPoint -50 , 100, 20);
  rect(xPoint + 15, yPoint-72, 70, 40);

  // draw the wheels
  fill(77, 66, 66);
  ellipse(xPoint + 25, yPoint-29, 24, 24);
  ellipse(xPoint + 75, yPoint-29, 24, 24);

}
drawCar2 = function(var xPoint, var yPoint){
  // draw the car body
  fill(30, 45, 204);
  rect(xPoint, yPoint, 100, 20);
  rect(xPoint, yPoint-22, 70, 40);

  // draw the wheels
  fill(77, 66, 66);
  ellipse(xPoint + 25, yPoint+21, 24, 24);
  ellipse(xPoint + 75, yPoint+21, 24, 24);

}
drawCar3 = function(var xPoint, var yPoint){
  // draw the car body
  fill(30, 204, 51);
  rect(xPoint, yPoint +50, 100, 20);
  rect(xPoint + 60, yPoint-22 +50, 40, 40);

  // draw the wheels
  fill(77, 66, 66);
  ellipse(xPoint + 25, yPoint+21 +50, 24, 24);
  ellipse(xPoint + 75, yPoint+21 +50, 24, 24);

}


