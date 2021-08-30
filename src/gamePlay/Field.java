package gamePlay;

import gamePlay.Bets;

public class Field {

    Bets bets = new Bets();
    String input = Bets.scn.next();
    private int makeBet = Integer.parseInt(input);

    public void betField(){
        bets.setBet(makeBet);
        payField();
    }

    public void payField(){
        if(bets.getDiceSum() == 3 || bets.getDiceSum() == 4 || bets.getDiceSum() == 9 || bets.getDiceSum() == 10 || bets.getDiceSum() == 11){
            bets.setPayment(bets.getBet());
        }
        else if(bets.getDiceSum() == 2 || bets.getDiceSum() == 12){
            bets.setPayment(bets.getBet() * 2);
        }
        else bets.setPayment(0);
    }
}
