package HumanVsGoblins;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human human;
    @BeforeEach
    public void setUp(){
        human = new Human("Joey",100);
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Weapon("Sword", 10));
        items.add(new Potion("Health",10));
        human.setInventory(items);
    }
    @Test
    void addHeath() {
        human.addHealth(100);
        assertEquals(human.getHealth(),100);
    }

    @Test
    void getHealth() {
        assertEquals(human.getHealth(),100);
    }
/*
    @Test
    void getCurrentWeaponInventory() {
    }

    @Test
    void getCurrentPotionInventory() {
    }

    @Test
    void getInventory() {
    }

    @Test
    void setInventory() {
    }*/
}