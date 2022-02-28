package HumanVsGoblins;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoblinTest {
    Goblin goblin;
    @BeforeEach
    void setUp() {
        goblin = new Goblin(100,100);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPower() {
        Assert.assertEquals(goblin.getPower(),100);
    }

    @Test
    void getHealth() {
        Assert.assertEquals(goblin.getHealth(),100);
    }

    @Test
    void setHealth() {
        goblin.setHealth(120);
        Assert.assertEquals(goblin.getHealth(),120);
    }
}