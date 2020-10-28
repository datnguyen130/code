package lab_03;

public class OneDimension {
    int marks[];
    public void storeMarks(){
        marks = new int[4];
        System.out.println("Storing Marks. Please wait...");
        marks[0] = 65;
        marks[1] = 47;
        marks[2] = 75;
        marks[3]= 50;
    }

    public void displayMarks (){
        System.out.println("marks are: ");
        System.out.println(marks[1] + marks[2] + marks[3] + marks[0]);

    }

    public static void main(String[] args) {
        OneDimension obj1 = new OneDimension();

        obj1.storeMarks();

        obj1.displayMarks();
    }
}
