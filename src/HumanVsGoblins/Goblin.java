package HumanVsGoblins;



public class Goblin {
    public int power;
    public int health;
    public Goblin( int health, int power){
        this.power = power;
    }
    public int getPower(){
        return this.power;
    }
    public int getHeath(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }

}
