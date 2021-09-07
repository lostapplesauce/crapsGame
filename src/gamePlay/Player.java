package gamePlay;

import gamePlay.Bets;

public class Player {

    static int buyIn;

    public static int playerBank(){
        System.out.println("How much do you wanna buy in for?");
        String buyInString = Bets.scn.nextLine();
        buyIn = Integer.parseInt(buyInString);

        System.out.println("Buying in for " + buyIn);

        return buyIn;
    }
}
