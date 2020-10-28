package lab_05.Ex7;

public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;
    public Invoice(int ID, Customer customer, double amount){
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCustomerName(){
        return this.customer.getName();
    }
    public double getAmountAfterDiscount(){
        return amount - amount * (this.getCustomer().getDiscount())/100;

    }

}
