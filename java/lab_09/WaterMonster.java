package lab_09;

public class WaterMonster extends Moster {
    public WaterMonster(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "attack with water!";
    }
}
