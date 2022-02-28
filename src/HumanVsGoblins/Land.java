package HumanVsGoblins;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Land {
    public int x;
    public int y;
    public ArrayList<Item> item;
    public Boolean hasGoblin;
    public Land(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.item = new ArrayList<>();
        this.hasGoblin = ThreadLocalRandom.current().nextInt(1, 1 + 1) == 1 ? true : false;

    }

}
