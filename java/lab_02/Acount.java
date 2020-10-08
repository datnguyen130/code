package lab_02;

public class Acount {
    private int accountID;
    private String holderName;
    private String accountType;

    {
        accountID = 100;
        holderName = "John";
        accountType = "Saving";

    }

    public void displayAccountDetails(){
        System.out.println(accountID + "\n" + accountType + "\n" + holderName);
    }

    public static void main(String[] args) {
        Acount obj1 = new Acount();
        obj1.displayAccountDetails();
    }
}
