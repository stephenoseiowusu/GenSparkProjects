package HangmanGUI;

import java.util.Random;

public class HangMan {
    public String[] words = {"play", "height", "sheet", "court","fraction","twin",
                             "blackmail","participate","estimate","inspector"};
    public String word = "";
    public String o_word = "";
    int wrongs = 0;
    public HangMan(){
        this.word = getWord();
        this.o_word =  word.replaceAll("[A-Za-z]","_");

    }
    public int guess(char letter){
        int index = word.indexOf(letter);
        int result = 1;
        if(index == -1){
            wrongs++;
            result = -1;
        }
        while(index >= 0) {
            System.out.println(index);
            StringBuilder stringBuilder = new StringBuilder(o_word);
            stringBuilder.setCharAt(index,letter);
            o_word = stringBuilder.toString();
            index = word.indexOf(letter, index+1);
        }
        return result;
    }
    public String getFollowedWord(){
        return this.o_word;
    }
    public void reset(){
        this.wrongs = 0;
    }
    public String getWord(){
        Random rand = new Random();
        int index = rand.nextInt(10-1);
        return words[index];
    }
}
