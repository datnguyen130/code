package lab_08.Ex4;

public class MovablePoint extends Point {
    public float xSpeed ;
    public float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);

    }
    public float[] getSpeed(){
        float[] ar = new float[2];
        ar[0] = this.getxSpeed();
        ar[1] = this.getySpeed();
        return ar;
    }
    @Override
    public String toString(){
        return super.toString() + ",speed=(" + getxSpeed() + "," + getySpeed() + ")";
    }
    public MovablePoint move(){
        this.setX(this.getX() + this.getxSpeed());
        this.setY(this.getY()+ this.getySpeed());
        return this;
    }
}
