package lab_02;

public class code_snippet_12 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(10,20);
        Rectangle obj2 = new Rectangle();

        obj2 = obj1;

        obj1.displayDimensions();
        obj2.displayDimensions();
    }
}
