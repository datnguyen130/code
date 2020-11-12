package JAVA2.Lab_09;

public class Bag {
    private int idBook;
    private String nameBook;
    private double price;
    private int qty;
    private int discount = 0;

    public Bag(){
        idBook = 0;
        nameBook = "";
        price = 0;
        qty = 0;
        discount = 0;
    }

    public Bag(int id, String name, double price, int qty){
        this.idBook = id;
        this.nameBook = name;
        this.price = price;
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public int getIdBook() {
        return idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void plusQty(int qty){
        this.qty += qty;
    }

    @Override
    public String toString() {
        return String.format("%-30s%-30s%-30.2f%-30d%-30d\n",idBook,nameBook,price,qty,discount);
    }
}
