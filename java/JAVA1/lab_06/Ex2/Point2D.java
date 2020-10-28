package lab_06.Ex2;

public class Point2D {
    private int x;
    private int y;

    public Point2D(){
        this.x = 0;
        this.y = 0;
    }
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y +")";
    }
}
