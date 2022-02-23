package Hangman;

import java.util.Random;
import java.util.Scanner;
public class Hangman {
    String [] words = {"hello","play","genspark","test","test2","whoa"};
    public int wrongs = 0;
    public static void main(String [] args){
        Hangman hangman = new Hangman();
        Scanner scan = new Scanner(System.in);
        String word = hangman.getWord();
        String wordcase =  word.replaceAll("[A-Za-z]","_");
        boolean hasWon = false;
        while(hasWon == false){
            String firstLine = " | --------------------";
            hangman.wrongs = 10;
            String secondLine = (hangman.wrongs > 1 ? " o ":" ") + "         |";
            String thirdLine = (hangman.wrongs > 2 ? " | ":" ") + "         |";
            String fourthLine =(hangman.wrongs > 3 ? "/|\\ ":" ") + "        |";
            String fifthLine = (hangman.wrongs > 4 ? "/ \\":" ") + "         |";
            String sixthLine = (hangman.wrongs > 5 ? "/  ":" ") + "         |";

            System.out.println(firstLine);
            System.out.println(secondLine);
            System.out.println(thirdLine);
            System.out.println(fourthLine);
            System.out.println(fifthLine);
            System.out.println("\n" + wordcase);
            System.out.println("Guess a letter ? ");
            char letter = scan.nextLine().charAt(0);



        }
    }
    public String getWord(){
        Random rand = new Random();
        int index = rand.nextInt(5);
        return words[index];
    }
}
