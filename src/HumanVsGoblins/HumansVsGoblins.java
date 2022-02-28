package HumanVsGoblins;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HumansVsGoblins {

    public Land[][] grid;
    public int humanX;
    public int humanY;
    public Human human;
    public HumansVsGoblins(){
        this.grid = new Land[10][10];
        this.human = new Human("Joe",100);
        this.humanX = 0;
        this.humanY = 0;
        for(int x = 0; x < 10; x ++){
            for(int y = 0; y < 10; y++){
                grid[x][y] = new Land(x,y);
                grid[x][y].hasGoblin = ThreadLocalRandom.current().nextInt(1, 1 + 1) == 1 ? true: false;
                if(ThreadLocalRandom.current().nextInt(1, 1 + 1) == 1){
                    byte[] array = new byte[7]; // length is bounded by 7
                    new Random().nextBytes(array);
                    String generatedString = new String(array, Charset.forName("UTF-8"));
                    grid[x][y].item.add(new Weapon(generatedString,ThreadLocalRandom.current().nextInt(1, 10)));
                }
                if(ThreadLocalRandom.current().nextInt(1, 1 + 1) == 1){
                    byte[] array = new byte[7]; // length is bounded by 7
                    new Random().nextBytes(array);
                    String generatedString = new String(array, Charset.forName("UTF-8"));
                    grid[x][y].item.add(new Potion(generatedString,ThreadLocalRandom.current().nextInt(1, 10)));
                }
            }
        }

    }
    public static void main(String [] args){
        HumansVsGoblins humansVsGoblins = new HumansVsGoblins();
        Scanner scan = new Scanner(System.in);
        while(humansVsGoblins.human.health > 0){
            for(int x = 0; x < 10; x ++){
                for(int y = 0; y < 10; y++){
                  if(humansVsGoblins.humanX != x || humansVsGoblins.humanY != y) {
                      System.out.print("L");
                  }
                  else if(humansVsGoblins.humanX == x && humansVsGoblins.humanY == y){
                      System.out.print("X");
                  }
                }
                System.out.println("\n");
            }
            System.out.println("Use w, a , s, d for navigation");
            String choice = scan.nextLine();
            switch(choice){
                case "w":
                    if(humansVsGoblins.humanX > 0 )
                    {
                        humansVsGoblins.humanX -=1;
                    }
                    break;
                case "a":
                    if(humansVsGoblins.humanY > 0 )
                    {
                        humansVsGoblins.humanY -=1;
                    }
                    break;
                case "s":
                    if(humansVsGoblins.humanX < 9 )
                    {
                        humansVsGoblins.humanX += 1;
                    }
                    break;
                case "d":
                    if(humansVsGoblins.humanY < 9 )
                    {
                        humansVsGoblins.humanY += 1;
                    }
                    break;
            }
           /* for(int x = 0; x < 10; x ++){
                for(int y = 0; y < 10; y++){
                    if(humansVsGoblins.humanX != x || humansVsGoblins.humanY != y) {
                        System.out.print("L");
                    }
                    else if(humansVsGoblins.humanX == x && humansVsGoblins.humanY == y){
                        System.out.print("X");
                    }
                }
                System.out.println("\n");

            }*/



        }
    }
}
