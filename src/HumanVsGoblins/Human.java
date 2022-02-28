package HumanVsGoblins;

import java.util.ArrayList;

public class Human {
    public ArrayList<Item> inventory;
    public String name;
    public int health;
    public Weapon current_weapon;
    public Human(String  name, int health){
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<Item>();
    }
    public void addHeath(int amount){
        this.health += amount;
        if(health > 100){
            health = 100;
        }
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public ArrayList<Weapon> getCurrentWeaponInventory(){
        ArrayList<Weapon> w = new ArrayList<>();
        for(Item i: inventory){
            if(i instanceof  Weapon){
                w.add((Weapon) i);
            }
        }
        return w;
    }
    public Weapon getCurrentWeapon(){
        return this.current_weapon;
    }
    public void setWeapon(Weapon weapon){
        this.current_weapon = weapon;
    }
    public ArrayList<Item> getInventory() {
        return inventory;
    }
    public void setInventory(ArrayList<Item> inventory){
        this.inventory = inventory;
    }
}
