package Exceptions;
import java.util.Scanner;

public class DragonCave {

    String [] intro_messages = {"You are in a land full of dragons. In front of you,",
                          "you see two caves.In one cave, the dragon if firendly",
                          "and will share his treasure with you. The other dragon",
                          "is greedy and hungry and will eat you on sight.",
                          "Which cave will you go into?"};
    public static void main(String []args){
        try {
            Scanner scanner = new Scanner(System.in);
            DragonCave dragonCave = new DragonCave();
            for (int x = 0; x < dragonCave.intro_messages.length; x++) {
                System.out.println(dragonCave.intro_messages[x]);
            }
            int input = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
