package lab_05.Ex3;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int[] getXY(){
        int[] XY = new int[2];
        XY[0] = this.x;
        XY[1] = this.y;
        return XY;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double distance(int x , int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(MyPoint another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(){
        int xDiff = this.x ;
        int yDiff = this.y ;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}
