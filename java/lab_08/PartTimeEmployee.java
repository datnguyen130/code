package lab_08;

public class PartTimeEmployee extends Employee {
    String shift;

    public PartTimeEmployee(String id, String name, int sal, String shift){
        super(id, name, sal);
        this.shift = shift;
    }
    @Override
    public void displayDetails(){
        calcCommission(12);
        super.displayDetails();
        System.out.println("Working shift :" + shift);
    }
}
