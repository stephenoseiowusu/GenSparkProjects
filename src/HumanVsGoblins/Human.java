package HumanVsGoblins;

import java.util.ArrayList;

public class Human {
    public ArrayList<Item> inventory;
    public String name;
    public int health;
    public Human(String  name, int health){
        this.name = name;
        this.health = health;
    }
    public void addHeath(int amount){
        this.health += amount;
        if(health > 100){
            health = 100;
        }
    }

}
