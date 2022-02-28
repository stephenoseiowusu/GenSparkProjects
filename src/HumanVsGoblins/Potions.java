package HumanVsGoblins;

public class Potions {
    public String name;
    public int healthPoints;
    public Potions(String name, int healthPoints){
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
