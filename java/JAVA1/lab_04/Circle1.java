package lab_04;

public class Circle1 {
    private double radius ;

    public Circle1(){
        radius = 1.0;
    }

    public Circle1(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double Newradius){
        this.radius = Newradius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getCircumference(){
        return 2 * radius * Math.PI;
    }

    public String toString(){
        return "Circle [ radius = " + this.radius + "]";
    }
}
