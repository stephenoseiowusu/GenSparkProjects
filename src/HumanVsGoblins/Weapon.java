package HumanVsGoblins;

public class Weapon extends Item {
    String name;
    int power;
    public Weapon(String name, int power){
        super(name);
        this.name = name;
        this.power = power;
    }
    public int getWeaponPower(){
        return this.power;
    }
    public String getWeaponName(){
        return this.name;
    }
}
