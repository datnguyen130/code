package lab_03;

public class Varargs {
    public void addNumber(int...num){
        int sum = 0;

        for (int i :num){
            sum = sum + i;
        }
        System.out.println("Sum of numbers is " + sum);
        System.out.println(num.length);
    }

    public static void main(String[] args) {
        Varargs obj = new Varargs();
        obj.addNumber(10,30,20,40);
    }
}
