package lab_03;

import javax.swing.plaf.metal.MetalTheme;

public class MathClass {
    public void add(int num1, int num2){
        System.out.println("addition of two : " + (num1 + num2)) ;
    }

    public void add(int num1, int num2, int num3){
        System.out.println("addition of three :" + (num1 + num2 + num3));
    }

    public void add(float num1, int num2){
        System.out.println("addition of two :" + (num1 + num2));
    }

    public void add(int num1, float num2){
        System.out.println("addition of two :" + (num1 + num2));
    }

    public void add(float num1, float num2){
        System.out.println("addition of two :" + (num1 + num2));
    }

    public static void main(String[] args) {
        MathClass obj = new MathClass();

        obj.add(3.4F,2);
        obj.add(4,5);
        obj.add(6,7,8);
    }
}
