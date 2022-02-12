package Exceptions;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[]args) {
        try{
         scan = new Scanner(System.in);
         rand = new Random();
       }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        String playAgain = "";
        try {
            do {
                int number = rand.nextInt(20 - 1) + 1;
                int guess = -1;
                int guesses = 0;
                System.out.println("What is your name? ");
                String name = scan.nextLine();
                System.out.printf("Well %s, I am thinking of a number between 1 and 20.\nTake a guess: ", name);
                try {
                    do {
                        guess = scan.nextInt();
                        guesses++;
                        if (guess > number) {
                            System.out.println("Guess is too high");
                        } else if (guess < number) {
                            System.out.println("Guess is too low");
                        }
                    } while (guess != number);
                }catch(Exception e){
                    System.out.println("Exception: " + e.getMessage());
                }
                System.out.printf("Good job, %s! You guess my number is %s guesses \n", name, guesses);
                System.out.println("Would you like to play again(y/n)?");
                scan.nextLine();
                playAgain = scan.nextLine();
                System.out.println("value of play again is " + playAgain);
            } while (playAgain.equalsIgnoreCase("Y"));
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
