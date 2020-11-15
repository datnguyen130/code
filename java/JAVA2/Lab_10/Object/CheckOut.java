package JAVA2.Lab_10.Object;

import java.util.List;

public class CheckOut {
    private List<Bag> listBag;
    private String email;
    private String payment;
    private String address;
    private double price;

    public CheckOut(){
        listBag = null;
        email = "";
        payment = "";
        address = "";
        price =0;
    }

    public CheckOut(List<Bag> listBag, String email, String payment, String address, double price){
        this.listBag = listBag;
        this.email = email;
        this.payment = payment;
        this.address = address;
        this.price = price;
    }

    public List<JAVA2.Lab_10.Object.Bag> getListBag() {
        return listBag;
    }

    public void setListBag(List<Bag> listBag) {
        this.listBag = listBag;
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
