import java.util.Random;

public class Dice {

    int MIN =1;
    int MAX = 6;


    public int RolleDice(){
        Random random = new Random();
        int roll = random.nextInt(MAX)+MIN;
        return roll;
    }

}
