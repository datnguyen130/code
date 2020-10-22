package lab_08;

public class TestVehicle {
    public static void main(String[] args) {
        FourWheeler obj1 = new FourWheeler("LA-09-1406", "Volkswagen", 4, true);
        obj1.showDetails();
        obj1.accelerate(200);
    }
}
