package JAVA2.Lab_10.Object;

public class Order {
    private int idOrder;
    private int idCus;
    private int status;
    private double total;
    private String timeOrder;

    public Order(){
        idCus = 0;
        idOrder = 0;
        status = 0;
        total = 0;
        timeOrder = null;
    }

    public Order(int idOrder, int idCus, int status, double total, String timeOrder){
        this.idOrder = idOrder;
        this.idCus = idCus;
        this.status = status;
        this.total = total;
        this.timeOrder =timeOrder;
    }

    public int getIdCus() {
        return idCus;
    }

    public double getTotal() {
        return total;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public int getStatus() {
        return status;
    }

    public String getTimeOrder() {
        return timeOrder;
    }

    public void setIdCus(int idCus) {
        this.idCus = idCus;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setTimeOrder(String timeOrder) {
        this.timeOrder = timeOrder;
    }

    @Override
    public String toString() {
        return String.format("%-30d%-30d%-30d%-30.2f%-30s\n",idOrder,idCus,status,total,timeOrder);
    }
}
