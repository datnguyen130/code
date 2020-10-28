package lab_03;

class circle {
    public  double getPI(){
        return 3.14;
    }
}
public class PassByRef{
    public void calcArea(circle objPi, double rad){
        double area = objPi.getPI() * rad *rad;

        System.out.println("Area of the Circle : " + area);
    }

    public static void main(String[] args) {
        PassByRef p1 = new PassByRef();
        p1.calcArea(new circle(),2);
    }
}
