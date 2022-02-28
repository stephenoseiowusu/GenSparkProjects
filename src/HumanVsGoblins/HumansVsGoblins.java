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
        ArrayList<Item> items = this.human.getInventory();
        items.add(new Weapon("Sword",50));
        this.human.setInventory(items);
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
            if(humansVsGoblins.grid[humansVsGoblins.humanX][humansVsGoblins.humanY].hasGoblin){
                System.out.println("battle iniatiated");
                Goblin goblin = new Goblin(100, ThreadLocalRandom.current().nextInt(1, 10));
                System.out.println("Choose your weapon:");
                ArrayList<Weapon> weapons = humansVsGoblins.human.getCurrentWeaponInventory();
                for(int index = 0; index < weapons.size();index++){
                    System.out.println(index + ": " + weapons.get(index).getWeaponName()  + " power:" + weapons.get(index ).getWeaponPower());
                }
                System.out.println("Weapon Choice: ");
                int index = scan.nextInt();
                humansVsGoblins.human.setWeapon(weapons.get(index));
                System.out.println("Battle initiated");
                System.out.println("Goblin started health is : " + goblin.getHealth());
                System.out.println("Human health is " + humansVsGoblins.human.getHealth());
                while((humansVsGoblins.human.getHealth() > 0 && goblin.getHealth() > 0)){
                    System.out.println("Goblin attacks human for " + goblin.getPower() + " attack");
                  humansVsGoblins.human.setHealth(humansVsGoblins.human.getHealth() - goblin.getPower());
                  System.out.println("Human attacks goblin for " + humansVsGoblins.human.getCurrentWeapon().getWeaponPower() + " attack");
                  goblin.setHealth(goblin.getHealth() - humansVsGoblins.human.getCurrentWeapon().getWeaponPower());
                  System.out.println("Goblin health is : " + goblin.getHealth());
                  System.out.println("Human health is : " + humansVsGoblins.human.getHealth());
                  if(goblin.getHealth() < 1 || humansVsGoblins.human.getHealth() < 1){
                      humansVsGoblins.grid[humansVsGoblins.humanX][humansVsGoblins.humanY].hasGoblin = false;
                      break;
                  }
                }
                System.out.println("You get to receive the loot:");
                for(Item e : humansVsGoblins.grid[humansVsGoblins.humanX][humansVsGoblins.humanY].item){
                    if(e instanceof  Weapon){
                        Weapon temp = (Weapon) e;
                        System.out.println("Weapon received is: " + temp.getWeaponName());
                        System.out.println("Its power is: " + temp.getWeaponPower());
                    }
                    else if(e instanceof  Potion){
                        Potion potion = (Potion) e;
                        System.out.println("Potion received is: " + potion.getName());
                        System.out.println("Its healing power is: " + potion.getHealthPoints());
                    }
                    humansVsGoblins.human.inventory.add(e);
                }
                System.out.println("Would you like to use a potion (Y/N) ?");
                String answer = scan.nextLine();
                answer = scan.nextLine();
                if(answer.equalsIgnoreCase("Y")){
                    Potion p;
                    for(int x = 0; x < humansVsGoblins.human.getCurrentPotionInventory().size(); x++)
                    {
                        p = humansVsGoblins.human.getCurrentPotionInventory().get(x);
                        System.out.println("index: " + x + "Potion name is " + p.getName() + ", its healing power is " + p.getHealthPoints());
                    }
                    System.out.println("Must choose potion: ");
                    int p_index = scan.nextInt();
                    p = humansVsGoblins.human.getCurrentPotionInventory().get(p_index);
                    humansVsGoblins.human.getCurrentPotionInventory().remove(p);
                    humansVsGoblins.human.addHealth(p.getHealthPoints());
                    System.out.println("Healed human for " + p.getHealthPoints() + " current health is " + humansVsGoblins.human.getHealth());
                }

            }



        }
    }
}
