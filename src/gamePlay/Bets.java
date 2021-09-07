package gamePlay;

import java.util.Scanner;
import java.util.*;

public class Bets {

    private ArrayList<Bets> allBets = new ArrayList<>();

    private int bet = 0;

    public Map<ArrayList<Bets>, Integer> betsMap = new HashMap<ArrayList<Bets>, Integer>();

    private int payment = 0;

    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();
    private int diceSum = dice1.getFaceValue() + dice2.getFaceValue();

    public int getDiceSum() {
        return diceSum;
    }

    public void setDiceSum(int diceSum) {
        this.diceSum = diceSum;
    }

    public int getBet() {
        return bet;
    }

    public int setBet(int bet) {
        return this.bet = bet;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public static Scanner scn = new Scanner(System.in);

    private int roll = (int)Math.floor(Math.random()*(12 - 1) + 0);

    private Integer no2 = 2, no3 = 3, no4 = 4, no5 = 5, no6 = 6, no7 = 7,
    no8 = 8, no9 = 9, no10 = 10, no11 = 11, no12 = 12;

    private int point = 0;
    private int currentPoint = 0;


    void field(){

        if(diceSum == no2 || diceSum == no12){
            System.out.println(diceSum);
            System.out.println("Double the field");
            payment = (bet * 2);
        }
        else if(diceSum == no6 || diceSum == no8 || diceSum == no5 || diceSum == no7){
            System.out.println(diceSum);
            System.out.println("Not in the field");
            payment -= bet;
        }
        else {
            System.out.println(diceSum);
            System.out.println("Win the field");
            payment = bet;
        }
    }

    public void setPassLine(){
        //TODO get point
        //TODO frontline winner 7
        //TODO ^ if statement for this ^
        System.out.println("setPassLine");

        System.out.println("How much do you wanna bet on Pass line?");
        bet = scn.nextInt();


        if(diceSum == no7 || diceSum == no11){
            System.out.println("Frontline winner!");
            payment = bet;
        } else if(diceSum == no2 || diceSum == no3 || diceSum == no12){
            System.out.println("crap");
            payment -= bet;
        } else {
            currentPoint = point;
            System.out.println("The point is now " + currentPoint);
            playingPassLine(); //rolling to get point
        }

        Player.buyIn += bet;
        System.out.println("Your new balance " + Player.buyIn);

    }

    private void playingPassLine(){
        //TODO 7 out
        //TODO point hits, get paid

        if(diceSum == no7){
            System.out.println(diceSum);
            System.out.println("7 out lines away");
            //TODO Everything is wiped with 7 out.
        } else if(diceSum != point){
            System.out.println(diceSum);
            System.out.println("keep rolling ");

        } else if(diceSum == currentPoint){
            System.out.println(diceSum);
            System.out.println("Frontline Winner");
        } else {
            System.out.println(diceSum);
        }
    }

    public void  comeLine(){
        //TODO number rolled bet goes there
        bet = scn.nextInt();
        if(diceSum == no7){
            payment = bet;
        }
        else if(diceSum == no2 || diceSum == no3 || diceSum == no12){
            payment -= bet;
        } else {
            point = diceSum;
            payComeLine();
        }
    }

    private void payComeLine(){
        if(diceSum == point) {
            payment += bet;
            System.out.println(payment);
        }
        else{
                System.out.println("still going");
            }
    }

}
