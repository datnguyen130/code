package lab_08;

public class FourWheeler extends Vehicle {
    private boolean powerSteer;

    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer){
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
        powerSteer = pSteer;
    }
    public void showDetails(){
        System.out.println("Vehicleno :" + vehicleNo);
        System.out.println("Vehicle Nmae :" + vehicleName);
        System.out.println("Number of wheels : " +wheels);

        if (powerSteer == true)
            System.out.println("Power Steering: Yes");
        else
            System.out.println("Power Steering: No");
    }
    @Override
    public void accelerate(int speed){
        System.out.println("Maxium acceleration: " + speed + " kmph");

    }
}
