package lab_05.Ex6;

import lab_04.Point;

public class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(int x1, int y1, int x2, int y2){
        topLeft = new Point(Math.max(x1, x2), Math.max(y1,y2));
        bottomRight = new Point(Math.min(x1,x2), Math.min(y1,y2));
    }
}
