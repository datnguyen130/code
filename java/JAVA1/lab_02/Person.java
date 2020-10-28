package lab_02;

public class Person {
    private String name = "John";
    private int age = 12;


    public void displayDimensions(){
        System.out.println(name);
        System.out.println(age);

    }


    public static void main(String[] args) {
        Person obj1 = new Person();

        obj1.displayDimensions();
    }
}
