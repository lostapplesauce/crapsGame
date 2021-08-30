package gamePlay;

import gamePlay.Board;
import gamePlay.Bets;

public class Horn {   //TODO do think all of this logic is fairly correct
    Bets bets = new Bets();

    private String input = Bets.scn.next();
    private int makeBet = Integer.parseInt(input);

    public void betHorn(){
        bets.setBet(makeBet);
        payHorn();
    }

    public void payHorn() {
        if (bets.getDiceSum() == 12 || bets.getDiceSum() == 2) {
            bets.setPayment(bets.getBet() * 30);
        }
        else if(bets.getDiceSum() == 11 || bets.getDiceSum() == 3){
            bets.setPayment(bets.getBet() * 15);
        }
        else{
            bets.setPayment(0);
        }
    }
}
