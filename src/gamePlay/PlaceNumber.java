package gamePlay;

import gamePlay.Bets;

public class PlaceNumber {

    Bets bets = new Bets();

    public void choosing(){
        System.out.println("What number do you wanna place? ");
        int numChoice = Bets.scn.nextInt();
        if(numChoice == 4 || numChoice == 10){
            System.out.println("How many units? ");
            int amountChoice = Bets.scn.nextInt();
            int amount = bets.setBet(5 * amountChoice);
            System.out.println(amount);
        }
        else if(numChoice == 5 || numChoice == 9){
            System.out.println("How many units? ");
            int amountChoice = Bets.scn.nextInt();
            int amount = bets.setBet(5 * amountChoice);
            System.out.println(amount);
        }
        else if(numChoice == 6 || numChoice == 8){
            System.out.println("How many units? ");
            int amountChoice = Bets.scn.nextInt();
            int amount = bets.setBet(6 * amountChoice);
            System.out.println(amount);
        }
    }
    
}
