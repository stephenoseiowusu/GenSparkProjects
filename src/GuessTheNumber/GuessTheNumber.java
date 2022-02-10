package GuessTheNumber;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(20 - 1) + 1;
        int guess = -1;
        int guesses = 0;
        System.out.println("What is your name? \n");
        String name = scan.nextLine();
        System.out.printf("Well %s, I am thinking of a number between 1 and 20. \n Take a guess.",name);
        do{
           guess = scan.nextInt();
           guesses++;
           if(guess > number){System.out.println("Guess is too high");}
           else if(guess < number){System.out.println("Guess is too low");}
        }while(guess != number);
        System.out.printf("Good job, %s! You guess my number is %s guesses",name,guesses );
    }
}
