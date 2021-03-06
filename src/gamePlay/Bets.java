package gamePlay;

import java.util.Scanner;
import java.util.*;

public class Bets {


    private int playerBank = 0;
    int bet = 0;
    int payment = 0;

    public static Scanner scn = new Scanner(System.in);

    int roll = (int)Math.floor(Math.random()*(12 - 1) + 0);

    Integer no2 = 2, no3 = 3, no4 = 4, no5 = 5, no6 = 6, no7 = 7,
    no8 = 8, no9 = 9, no10 = 10, no11 = 11, no12 = 12;

    int[] numbers = {no2, no3, no4, no5, no6, no7, no8, no9, no10, no11, no12};
    int point = numbers[roll];
    int currentPoint = 0;

    //TODO set up choose to roll option
    int dice = numbers[roll]; //random roll of numbers

    public void field(){
        if(dice == no2 || dice == no12){
            System.out.println(dice);
            System.out.println("Double the field");
            payment = (bet * 2);
        }
        else if(dice == no6 || dice == no8 || dice == no5){
            System.out.println(dice);
            System.out.println("Not in the field");
            payment -= bet;
        }
        else {
            System.out.println(dice);
            System.out.println("Win the field");
            payment = bet;
        }
    }

    public void setPassLine(){
        //TODO get point
        //TODO frontline winner 7
        //TODO ^ if statement for this ^
        System.out.println("setPassLine");
        bet = scn.nextInt();

        System.out.println("You are betting " + bet);

        if(dice == no7 || dice == no11){
            System.out.println("Frontline winner!");
            payment = bet;
        } else if(dice == no2 || dice == no3 || dice == no12){
            System.out.println("crap");
            payment -= bet;
        } else {
            currentPoint = point;
            System.out.println("The point is now " + currentPoint);
            playingPassLine(); //rolling to get point
        }
        playerBank += payment;
        
    }

    public void playingPassLine(){
        //TODO 7 out
        //TODO point hits, get paid
        dice = numbers[roll];

        if(dice == no7){
            System.out.println(dice);
            System.out.println("7 out lines away");
            //TODO Everything is wiped with 7 out.
        } else if(dice != point){
            System.out.println(dice);
            System.out.println("keep rolling ");

        } else if(dice == currentPoint){
            System.out.println(dice);
            System.out.println("Frontline Winner");
        } else {
            dice = numbers[roll];
        }
    }

    public void  comeLine(){
        //TODO number rolled bet goes there
        bet = scn.nextInt();
        System.out.println("You're betting " + bet);
        if(dice == no7){
            payment = bet;
        }
        else if(dice == no2 || dice == no3 || dice == no12){
            payment -= bet;
        } else {
            point = dice;
            comeLinePoint();
        }
        playerBank += bet;
        System.out.println(playerBank);
    }

    public void comeLinePoint(){

        System.out.println("Bet is " + bet);
        if(dice == point){
            payment = bet;
        }

        else if(dice == no7){
            bet = 0;
        }

        playerBank += bet;
        System.out.println(playerBank);
    }

    public void horn(){
        //TODO has to get roll on next turn or doesn't win
        if(dice == no2 || dice == no12){
            payment = (bet *= 30);
        }
        else if(dice == no3 || dice == no11){
            payment = (bet *= 15);
        } else {
            bet = 0;
        }
        playerBank += bet;
    }
}
