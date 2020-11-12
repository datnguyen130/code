package JAVA2.Lab_09;

public class CheckOut {
    private String email;
    private String payment;
    private String address;
    private double price;

    public CheckOut(){
        email = "";
        payment = "";
        address = "";
        price =0;
    }

    public CheckOut(String email, String payment, String address, double price){
        this.email = email;
        this.payment = payment;
        this.address = address;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPayment() {
        return payment;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
