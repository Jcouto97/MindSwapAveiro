package academy.mindswap.module1.guessTheNumber;

public class Game {
    private Player player1;
    private Player player2;
    private Computer computer1;



    public Game(Player player1, Player player2, Computer computer1) {
        this.player1 = player1;
        this.player2 = player2;
        this.computer1 = computer1;
    }

    public String allChoices() {
        return "Player " + player1.getName() + " sorts " + player1.getChoice() + ", Player " + player2.getName() + " sorts " + player2.getChoice() + " and " + computer1.getName() + " sorts " + computer1.getChoice();
    }

    public String play () {

        while(this.player1.getChoice() != this.computer1.getChoice() && this.player2.getChoice() != this.computer1.getChoice()){
            this.player1.getNewNumber();
            this.player2.getNewNumber();
            System.out.println(this.allChoices());
        }

        if (this.player1.getChoice() == this.player2.getChoice()) {
                System.out.println(this.allChoices());
                return "Draw";
        }
        if (this.player1.getChoice() == this.computer1.getChoice()) {
            System.out.println(this.allChoices());
            return player1.getName() + " wins";
        }

        return player2.getName() + " wins";
    }
}



