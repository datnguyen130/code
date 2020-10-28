package lab_03;

public class Employee {
    int empID ;
    String empName;
    private String SSN;
    protected String empDesig;
    public Employee( int ID, String name){
        empID = ID;
        empName = name;
    }
    public String getSSN (){
        return  SSN;
    }
    public void setSSN (String ssn){
        SSN = ssn;
    }
    public void setDesig(String desig){
        empDesig = desig;
    }
    public void display(){
        System.out.println("ID : " + empID);
        System.out.println("Name : " + empName);
        System.out.println("Designation : " + empDesig);
        System.out.println("SSN : " + SSN);
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee(1200, "Roger Stevens");
        obj1.empDesig = "Manager";
        obj1.SSN = "11-296";
        obj1.display();
    }
}
