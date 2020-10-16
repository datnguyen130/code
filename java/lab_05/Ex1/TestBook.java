package lab_05.Ex1;

public class TestBook {
    public static void main(String[] args) {
        Author objAuthor1 = new Author("Dat", "dat123@gamil.com",'m');
        System.out.println(objAuthor1);

        Book objBook1 = new Book("Java", objAuthor1, 100.00,100);
        System.out.println(objBook1);

        objBook1.setPrice(100);
        objBook1.setQty(100);

        System.out.println(objBook1.getName());
        System.out.println(objBook1.getPrice());
        System.out.println(objBook1.getQty());
        System.out.println(objBook1.getAuthor());
        System.out.println(objBook1.getAuthor().getName());
        System.out.println(objBook1.getAuthor().getEmail());

        Book objBook2 = new Book("More Java", new Author("Dang Kim Thi", "dangkimthi@gmail.com",'f'),200,200);
        System.out.println(objBook2);
    }
}
