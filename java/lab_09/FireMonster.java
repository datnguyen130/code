package lab_09;

public class FireMonster extends Moster {
    public FireMonster(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "attack with fire!";
    }
}
