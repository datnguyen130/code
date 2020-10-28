package lab_03;

public class MyClass {
    int x;

    // Constructor with a parameter
    public MyClass(int a) {
        x = a;
    }

    // Call the constructor
    public static void main(String[] args) {
        MyClass myObj = new MyClass(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
