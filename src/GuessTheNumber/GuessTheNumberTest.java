package GuessTheNumber;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {
    GuessTheNumber guessTheNumber;
    @BeforeEach
    void setUp() {
        guessTheNumber = new GuessTheNumber();
    }
    @Test
    public void rightNumber(){
        Assert.assertNotNull(guessTheNumber.getRandomNumber());
    }
    @AfterEach
    void tearDown() {
    }
}