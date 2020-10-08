package lab_02;


public class TestCustomer {
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
