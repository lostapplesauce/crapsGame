package gamePlay;

import gamePlay.Bets;

import java.util.Collection;


public class Board {
    String choice = Bets.scn.nextLine(); //example of how to call Scanner from other class

    Bets bet = new Bets();

    public void boardChoice() {
        switch (choice) {
            case "1": bet.setPassLine();  //advanced case "1" -> bet.setPassLine();
                break;
            case "2": bet.field();
                break;
            case "3": bet.comeLine();
                break;
        }
    }
}
