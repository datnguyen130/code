package lab_04;

public class Point {
    private double x;
    private double y;

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
    public void displayPoint(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void compareTwoPoint(Point obj1, Point obj2){
        if ((obj1.x == obj2.x) && (obj1.y == obj2.y)){
            System.out.println("Two Points are Same");
        }
        else System.out.println("Two Point are Different");
    }
}
