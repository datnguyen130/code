package lab_08;

public class EmployeeDetailss {
    public static void main(String[] args) {
        Employee obj = new Employee("E001", "Maria", 40000);
        obj.calcCommission(2000F);
        obj.displayDetails();
        System.out.println("-------------------------");
        Employee obj1 = new PartTimeEmployee("E002", "Rob", 30000, "Day");
        obj1.displayDetails();
    }
}
