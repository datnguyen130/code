package lab_08;

public class Rectangle extends Shape {
    float perimeter;
    float length = 10;

    @Override
    void calculate(float width){
        perimeter = 2 * (length + width);
        System.out.println("Perimeter of the Rectangle is :" + perimeter);
    }
}
