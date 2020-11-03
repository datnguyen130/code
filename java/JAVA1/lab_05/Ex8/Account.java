package lab_05.Ex8;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance){
        this.id = id ;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer){
        this.id = id ;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return this.customer.toString() + String.format("Blance = $ %.2f",balance);
    }
    public String getCustomerName(){
        return this.getCustomer().getName();
    }
    public Account deposit(double amount){
        this.balance += amount;
        return this;
    }
    
}