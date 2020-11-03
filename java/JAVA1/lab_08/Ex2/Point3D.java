package lab_08.Ex2;

import lab_06.Ex2.Point2D;

public class Point3D extends Point2D {
    int z ;

    public Point3D(){
        super();
        this.z = 0;
    }
    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}