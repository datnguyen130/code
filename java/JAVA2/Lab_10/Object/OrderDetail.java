package JAVA2.Lab_10.Object;

public class OrderDetail {
    private int idOrder;
    private int idBook;
    private int qty;
    private double price;

    public OrderDetail(){
        idBook = 0;
        idOrder = 0;
        qty =0;
        price = 0;

    }

    public OrderDetail(int idOrder, int idBook, int qty, double price){
        this.idOrder = idOrder;
        this.idBook = idBook;
        this.qty = qty;
        this.price = price;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public double getPrice() {
        return price;
    }

    public int getIdBook() {
        return idBook;
    }

    public int getQty() {
        return qty;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return String.format("%-30d%-30d%-30d%-30.2f\n",idOrder,idBook,qty,price);
    }
}
