package lab_04;

public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name,int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    public int credit(int amount){
        return balance + amount;
    }
    public int debit(int amount){
        if (amount <= balance){
            System.out.println("debit success");
            return balance - amount;
        }
        else {
            System.out.printf("amount exceeded");
            return balance;
        }
    }
    public String toString(){
        return "Account[id=" + id + ",name="+name+",balance="+ balance +"]";
    }
    public int transferTo(Account newAccount, int amount){
        if (amount <= this.balance){
            newAccount.balance += amount;
            return this.balance - amount;
        }
        else {
            System.out.println("amount exceeded");
            return this.balance;
        }
    }
}
