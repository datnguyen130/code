package lab_08;

public class Employee {
    String emId;
    String empName;
    int salary;
    float commission;

    public Employee(String id, String name, int sal){
        emId = id;
        empName = name;
        salary = sal;
    }

    public void calcCommission(float sales){
        if (sales>10000)
            commission = salary*20/100;
        else
            commission = 0;
    }

    public void calcCommission(int overtime){
        if (overtime > 8)
            commission = salary/30;
        else
            commission = 0;
    }
    public void displayDetails(){
        System.out.println("Employee ID :" + emId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
        System.out.println("Commission :" + commission);
    }

}
