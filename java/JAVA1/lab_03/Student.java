package lab_03;

public class Student {
    int rollNo;
    String name;
    String address;
    float marks;

    public Student(){
        rollNo = 0;
        name = "";
        address = "";
        marks = 0;
    }
    public Student(int rNo, String sname){
        rollNo = rNo;
        name = sname;
    }
    public Student(int rNo, float Score){
        rollNo = rNo;
        marks = Score;
    }
    public void displayDetails (){
        System.out.println(rollNo + name + address + marks);
    }
}
