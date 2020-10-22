package lab_08.Ex5;

public class Square extends Rectangle {
    public Square(){
        width = length = 1.0;
    }
    public Square(double side){
        width = length = side;
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        this.width = this.length = side;
    }

}
