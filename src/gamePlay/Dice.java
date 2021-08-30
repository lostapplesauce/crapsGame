package gamePlay;

import java.util.Random;

public class Dice {
    static int sidesOfDice = 6;
    int faceValue = 0;

    public int getFaceValue(){
        return this.faceValue;
    }

    public int roll(){
        Random rand = new Random();
        this.faceValue = rand.nextInt(Dice.sidesOfDice) + 1;
        return this.faceValue;
    }
}
