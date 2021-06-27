package gamePlay;

import gamePlay.Bets;

import java.util.Collection;


public class Board {
    String choice = Bets.scn.nextLine(); //example of how to call Scanner from Bets class

    Bets bet = new Bets();

    public void boardChoice() {
        switch (choice) {
            case "1" -> bet.setPassLine();
            case "2" -> bet.field();
            case "3" -> bet.comeLine();
            case "4" -> bet.horn();
        }
    }
}
