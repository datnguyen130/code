package lab_02;

    public class Customer{
        int customerId;
        String customerName;
        String customerAdress;
        int customerAge;


        public static void main(String[] args) {
            Customer objCustomer1 = new Customer();
            objCustomer1.customerId = 100;
            objCustomer1.customerName = "John";
            objCustomer1.customerAdress = "123 Street";
            objCustomer1.customerAge = 30;
            System.out.println(objCustomer1.customerId);
            System.out.println(objCustomer1.customerAdress);
        }

    }


