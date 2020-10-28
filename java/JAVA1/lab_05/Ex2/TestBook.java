package lab_05.Ex2;

import lab_05.Ex1.Author;
import lab_05.Ex2.Book;

public class TestBook {
    public static void main(String[] args) {
        Author[] arrayAuthor1 = new Author[2];
        arrayAuthor1[0] = new Author("Dat", "dat123@gamil.com",'m');
        arrayAuthor1[1] = new Author("Son", "son123@gamil.com",'m');


        lab_05.Ex2.Book objBook1 = new lab_05.Ex2.Book("Java", arrayAuthor1 , 100.00,100);
        System.out.println(objBook1);

        objBook1.setPrice(100);
        objBook1.setQty(100);

        System.out.println(objBook1.getName());
        System.out.println(objBook1.getPrice());
        System.out.println(objBook1.getQty());
        System.out.println(objBook1.getAuthorNames());

    }
}
