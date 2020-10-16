package lab_05.Ex5;

import lab_05.Ex3.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1,y1);
        v2 = new MyPoint(x2,y2);
        v3 = new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }
    public double getPerimeter(){
        return v1.distance(v2) + v2.distance(v3)+ v3.distance(v1);
    }
    public String getType(){
        double v12 = v1.distance(v2);
        double v13 = v1.distance(v3);
        double v23 = v2.distance(v3);
        if (v12 == v13 && v12 ==v23){
            return "Equilateral";
        }
        else if((v12 == v13 && v12 != v23) || (v12 == v23 && v12!= v13) || (v23 == v13 && v23 != v12)){
            return "Isosceles";
        }
        else return "Scalene";
    }
}
