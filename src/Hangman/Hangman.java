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
        Boolean hasWon = null;
        hangman.wrongs = 0;
        while(hasWon == null){
            String firstLine = " | --------------------";

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
            int index = word.indexOf(letter);
            if(index == -1){
                hangman.wrongs++;
            }
            //System.out.println("index is " + index);
            while(index >= 0) {
                System.out.println(index);
                StringBuilder stringBuilder = new StringBuilder(wordcase);
                stringBuilder.setCharAt(index,letter);
                wordcase = stringBuilder.toString();
                index = word.indexOf(letter, index+1);
            }
           if(hangman.wrongs > 4){
               hasWon = false;
               break;

           }


        }
        if(hasWon == false){
            System.out.println("You lost");
        }
        else{
            System.out.println("You won");
        }
    }
    public String getWord(){
        Random rand = new Random();
        int index = rand.nextInt(5);
        return words[index];
    }
}
