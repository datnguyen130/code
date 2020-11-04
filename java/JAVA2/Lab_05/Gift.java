package JAVA2.Lab_05;

public class Gift {
    public int id;
    public String title;
    public String author;
    public double price;
    public int qty;
    public Gift(int id, String title, String author, double price, int qty){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public Gift(){
        this.id = 0;
        this.title = "";
        this.author = "";
        this.price = 0;
        this.qty = 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
