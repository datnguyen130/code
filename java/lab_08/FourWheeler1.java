package lab_08;

class FourWheeler1 extends Vehicle1 {
    private boolean powerSteer;

    public FourWheeler1(String vId, String vName, int numWheels, boolean pSteer){
        super(vId,vName,numWheels);
        powerSteer = pSteer;
    }
    public void showDetails(){
        System.out.println("Vehicle no : " + vehicleNo);
        System.out.println("Vehicle Name : "+ vehicleName);
        System.out.println("Number of Wheels : " + wheels);
        if (powerSteer == true)
            System.out.println("Power Steering : Yes");
        else
            System.out.println("Power Stearing : No");
    }

    @Override
    public void accelerate(int speed){
        super.accelerate(speed);
        System.out.println("Maxinum acceleration: " + speed + "kmph") ;
    }
}
