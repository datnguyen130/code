package lab_06.Ex1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super();
        this.height = 1.0;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    public Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*height + 2 *super.getArea();
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    @Override
    public String toString(){
        return "Cyliner[" + super.toString() + ",height=" + height +"]";
    }
}
