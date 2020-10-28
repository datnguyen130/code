package lab_05.Ex1;

public class TestAuthor {
    public static void main(String[] args) {
        Author obj1 = new Author("Dat","dat@gmail.com",'m');
        System.out.println(obj1);

        obj1.setEmail("dat123@gmail.com");

        System.out.println(obj1);
        System.out.println(obj1.getName());
        System.out.println(obj1.getEmail());
        System.out.println(obj1.getGender());
    }
}
