package Exam;

public class Flight {
    private int number;
    private String destination;

    public Flight(){
        this.number = 0;
        this.destination = "";
    }

    public Flight(int number, String destination){
        if (number > 0){
            this.number = number;
            this.destination = destination;
        }
        else {
            System.out.println("Invalid value");
        }
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public void display(){
        System.out.println(this.getNumber() + ", " + this.getDestination());
    }
}
