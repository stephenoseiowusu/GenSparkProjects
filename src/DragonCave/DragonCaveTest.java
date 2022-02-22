package DragonCave;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {
    DragonCave dragonCave;
    @BeforeEach
    void setUp() {
        dragonCave = new DragonCave();
    }
    @Test
    public void test(){
        Assert.assertNotNull(dragonCave.getIntro_messages());
    }
    @AfterEach
    void tearDown() {
    }
}