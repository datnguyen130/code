package lab_02;

public class Customer2 {
    int customerId;
    String customerAddress;
    String customerName;
    int customerAge;

    void changeCustomerAddress (String address){
        customerAddress = address;
    }

    void displayCustomerInformation (){
        System.out.println(customerId);
        System.out.println(customerAddress);
        System.out.println(customerName);
        System.out.println(customerAge);
    }
    public static void main(String[] args) {
        Customer2 objCustomer = new Customer2();

        objCustomer.customerId = 100;
        objCustomer.customerName = "Jack";
        objCustomer.customerAddress = "123 Street";
        objCustomer.customerAge = 30;

        objCustomer.displayCustomerInformation();

        objCustomer.changeCustomerAddress("123 Fort, Main Street");

        objCustomer.displayCustomerInformation();
    }
}
