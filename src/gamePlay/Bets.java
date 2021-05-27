package gamePlay;

import java.util.Scanner;
import java.util.*;

public class Bets {


    public int playerBank = 0;
    int bet = 0;
    int payment = 0;

    Scanner scn = new Scanner(System.in);

    int roll = (int)Math.floor(Math.random()*(12 - 1) + 0);

    Integer no2 = 2, no3 = 3, no4 = 4, no5 = 5, no6 = 6, no7 = 7,
    no8 = 8, no9 = 9, no10 = 10, no11 = 11, no12 = 12;

    int[] numbers = {no2, no3, no4, no5, no6, no7, no8, no9, no10, no11, no12};
    int point = numbers[roll];
    int currentPoint = 0;
    int dice = numbers[roll];

    public void field(){
        if(numbers[roll] == no2 || numbers[roll] == no12){
            payment = (bet * 2);
        } else {
            payment = bet;
        }
    }

    public void setPassLine(){
        //TODO get point
        //TODO frontline winner 7
        //TODO ^ if statement for this ^
        bet = scn.nextInt();


        if(point == no7){
            System.out.println("Frontline winner!");
            payment = bet;
        } else if(roll == no2 || roll == no3 || roll == no12){
            payment -= bet;
        } else {
            currentPoint = point;
            System.out.println("The point is now " + currentPoint);
            playingPassLine();
        }
        playerBank += payment;
        
    }

    public void playingPassLine(){
        //TODO 7 out
        //TODO point hits, get paid
        dice = numbers[roll];

        if(point == no7){
            System.out.println("7 out lines away");
            //TODO Everything is wiped with 7 out.
        } else if(dice != point){
            System.out.println("keep rolling ");

        } else if(dice == currentPoint){
            System.out.println("Frontline Winner");
        } else {
            dice = numbers[roll];
        }
    }

    public void  comeLine(){
        //TODO number rolled bet goes there
    }
}
