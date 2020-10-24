package lab_10.Ex1;

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
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                "} " + super.toString();
    }
}
