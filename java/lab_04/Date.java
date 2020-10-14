package lab_04;

public class Date {
    private int day ;
    private int month;
    private int year;

    public Date(){
        if (day <= 0 || day > 31){
            System.out.println("Invalid day");
        }
    }

    public static void main(String[] args) {
        Date obj1 = new Date();
        obj1.day = 32;
    }

}
