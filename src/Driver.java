import gamePlay.Bets;
import gamePlay.Board;
import gamePlay.Dice;
import gamePlay.Player;

public class Driver {

    public static void main(String[] args){

        System.out.println("Do you wanna play? Yes or No" );
        String choice = Bets.scn.nextLine().toLowerCase();

        if(choice.equals("yes")){
        //TODO make it so can make multiple bets
            //Board board = new Board(); //can't use while loop here for Player.playerBank
           // board.boardChoice();

            while(Player.playerBank() != 0) {// this is only a single player
                                             // how much want to buy in for
                Dice dice1 = new Dice(); //Don't think I need these here.
                Dice dice2 = new Dice();

                //TODO input Bets collection for multiple bets here

                for (int i = 0; i < 6; i++) {
                    System.out.println("This is dice roll: " + dice1.roll());
                    System.out.println("This is dice2 roll: " + dice2.roll());
                    int sum = dice1.getFaceValue() + dice2.getFaceValue();
                    System.out.println("Dice Sum: " + sum);
                }
            }
        }
        else if(choice.equals("no")){
            System.out.println("Thanks for coming");
        }
    }
}
