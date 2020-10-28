package lab_05.Ex3;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i< points.length;i++){
            points[i] = new MyPoint(i+1,i+1);
        }
    }
}
