package lab_10.Ex1;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5,"RED",false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

//        Shape s2 = new Shape();
        Shape s3 = new Rectangle(1.0,2.0,"RED",false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getPerimeter());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);

        Square sq1 = (Square)r2;
        System.out.println(sq1);
    }
}
