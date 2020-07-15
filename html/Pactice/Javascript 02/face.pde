void setup()
{
  size(800,800);
}

noStroke();
var eyeSize = 40;
var x = 200;



draw = function() {
    // face
    fill(255, 255, 0);
    ellipse(x, 208, 300, 300);

    // eyes
    fill(46, 46, 41);
    ellipse(x - 50, 151, eyeSize, eyeSize);
    ellipse(x + 100, 142, eyeSize, eyeSize);

    // mouth
    fill(0, 0, 255);
    ellipse(x + 50, 240, 120, 136);

    eyeSize-=0.3;

    drawFace(200,159,0.2);
    drawFace(600,73,0.1);

};

drawFace = function(size,color,speed){
    //face
    fill(255,color,0);
    ellipse(size,600,300,300);
    //eyes
    fill(color,46,255);
    ellipse(size + 80,530,eyeSize,eyeSize);
    ellipse(size - 40,530,eyeSize,eyeSize);
    //mouth
    fill(color,0,255);
    ellipse(size+30,650,120,130);
    eyeSize - speed;
};