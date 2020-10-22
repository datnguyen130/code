package lab_08.Ex6;

public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }
    public static void methodA(){
        System.out.println("Enter methodA()");
        try{
            System.out.println(1/0);
        }
        finally {
            System.out.println("finaly in methodA()");
        }
        System.out.println("Exit methodA()");
    }
}
