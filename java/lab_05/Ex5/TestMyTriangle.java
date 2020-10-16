package lab_05.Ex5;

import lab_05.Ex5.MyTriangle;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle obj1 = new MyTriangle(0,0,1,0,2,0);
        System.out.println(obj1.toString());
        System.out.println(obj1.getType());
    }
}
