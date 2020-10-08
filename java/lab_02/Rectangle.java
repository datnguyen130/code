package lab_02;

public class Rectangle {
    private int width;
    private int height;

    Rectangle(){
        System.out.println("Constructor Invoked...");
        width = 10;
        height = 10;
    }
    Rectangle(int wid, int heig){
        System.out.println("Parametrized Constructor");
        width = wid;
        height = heig;
    }
    public void displayDimensions(){
        System.out.println(width);
        System.out.println(height);

    }

    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle(6,9);

        obj1.displayDimensions();
        obj2.displayDimensions();
    }


}

