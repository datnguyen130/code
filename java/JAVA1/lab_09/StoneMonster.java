package lab_09;

public class StoneMonster extends Moster {
    public StoneMonster(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "attack with stone!";
    }
}
