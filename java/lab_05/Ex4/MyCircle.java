package lab_05.Ex4;

import lab_05.Ex3.MyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle(){
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterY(int Y){
        this.center.setY(Y);
    }
    public int[] getCenterXY(){
        return this.center.getXY();
    }
    public void setCenterXY(int x, int y){
        this.center.setXY(x,y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double GetCircumference(){
        return 2.0 * Math.PI * radius;
    }
    public double distance( MyCircle another ){
        return center.distance(another.center);
    }

}
