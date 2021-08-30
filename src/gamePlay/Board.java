package gamePlay;

import gamePlay.Bets;

import java.util.Collection;


public class Board {
    private String choice = Bets.scn.nextLine(); //example of how to call Scanner from other class

    private Bets bet = new Bets();

    public void boardChoice() {
        //can't use while loop here for Player.playerBank
        switch (choice) {
            case "1":
                bet.setPassLine();  //advanced case "1" -> bet.setPassLine();
                break;
            case "2":
                bet.field();
                break;
            case "3":
                bet.comeLine();
                break;
        }
    }
}
