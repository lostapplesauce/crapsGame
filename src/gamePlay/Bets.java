package gamePlay;

import java.util.Scanner;

public class Bets {

    public int playerBank = 0;
    int bet = 0;
    int payment = 0;

    Scanner scn = new Scanner(System.in);
    String roll = scn.next();

    String no2 = "2", no3 = "3", no4 = "4", no5 = "5", no6 = "6", no7 = "7",
    no8 = "8", no9 = "9", no10 = "10", no11 = "11", no12 = "12";

    public void field(){
        if(roll.equals(no2) || roll.equals(no3)){
            payment = bet;
        }
    }

    public void passLine(){
        //TODO get point
        //TODO point hits, get paid
        //TODO ^ if statement for this ^
        payment = bet;
    }

    public void  comeLine(){
        //TODO number rolled bet goes there
    }
}
