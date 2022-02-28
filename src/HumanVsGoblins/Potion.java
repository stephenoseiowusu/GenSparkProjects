package HumanVsGoblins;

public class Potion extends  Item {
    public String name;
    public int healthPoints;
    public Potion(String name, int healthPoints){
        super(name);
        this.name = name;
        this.healthPoints = healthPoints;
    }
    public String getName(){
        return this.name;
    }
    public int getHealthPoints(){
        return this.healthPoints;
    }
}
