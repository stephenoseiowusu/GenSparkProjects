package DragonCave;

public class DragonCave {

    String [] intro_messages = {"You are in a land full of dragons. In front of you,",
                          "you see two caves.In onve cave, the dragon if firendly",
                          "and will share his treasure with you. The other dragon",
                          "is greedy and hungry and will eat you on sight.",
                          "Which cave will you go into?"};
    public static void main(String []args){
        DragonCave dragonCave = new DragonCave();
        for(int x = 0; x < dragonCave.intro_messages.length; x++){
            System.out.println(dragonCave.intro_messages[x]);
        }
    }
}
