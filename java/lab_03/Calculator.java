package lab_03;

public class Calculator {
    public void add(int num1, int num2){
        int num3;
        num3 = num1 + num2;
        System.out.println("result of add : " + num3);
    }

    public void sub(int num1, int num2){
        int num3;
        num3 = num1 - num2;
        System.out.println("result of sub : " + num3 );

    }

    public void  mul(int num1, int num2){
        int num3 = num1 * num2;
        System.out.println("Result of mul : " + num3);
    }

    public void  div(int num1, int num2){
        int num3 = num1 / num2;
        System.out.println("Result of div : " + num3);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add(3,4);
        obj.mul(3,4);
    }
}
