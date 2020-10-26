package Exam;

public class testBank {
    public static void main(String[] args) {
        Bank obj = new Bank(1000, 10);
        System.out.println("The interest is : " + obj.calculateInterest());
    }
}
