package lab_08.Ex4;

public class Point {
    private float x;
    private float y;

    public Point(){
        x = 0.0f;
        y = 0.0f;
    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }
    public float[] getXY(){
        float[] ar = new float[2];
        ar[0] = this.getX();
        ar[1] = this.getY();
        return ar;
    }
    public String toString(){
        return "(" + getX() + "," + getY() + ")";
    }
}
