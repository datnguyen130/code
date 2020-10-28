package lab_05.Ex2;

import lab_05.Ex1.Author;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty;
    public Book(String name, Author[] author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public Book(){
        this.qty = 0;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return author;
    }



    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toStringAuthor(Author[] authors){
        String sum = authors[0].toString() ;
        for (int i = 1; i<authors.length; i++){
            sum += authors[i].toString();
        }
        return sum;
    }

    public String toString() {
        String sum = this.getAuthor()[0].toString();
        for (int i = 1 ; i<this.getAuthor().length;i++){
            sum+= this.getAuthor()[i].toString();
        }
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + sum +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
    public String getAuthorNames(){
        String sum = this.getAuthor()[0].getName() + ",";
        for (int i = 1; i <this.getAuthor().length; i++){
            sum+= this.getAuthor()[i].getName();
        }
        return sum;
    }

}
