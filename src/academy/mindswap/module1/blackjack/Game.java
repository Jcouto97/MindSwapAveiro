package academy.mindswap.module1.blackjack;

public class Game {
    private Player player;
    private Player dealer;

    public Game(Player player, Player dealer) {
        this.player = player;
        this.dealer = dealer;
    }

    public String play() {
        boolean isThereWinner = false;
        String winners = "";
        boolean isEnded = false;
        while (!isEnded) {

            if (!this.player.aboveMax()) {
                System.out.println("Players card dealt: " + this.player.askNewCard());
                if (this.player.getSum() > 21) {
                    winners += this.dealer.getName() + " ";
                    System.out.println("Joao bust with " + this.player.getSum());
                    isThereWinner = true;
                    break;
                }
            } else {
                System.out.println("Player is holding");
            }

            if (!this.dealer.aboveMax()) {
                System.out.println("Dealers card dealt: " + this.dealer.askNewCard());
                if (this.dealer.getSum() > 21) {
                    winners += this.player.getName() + " ";
                    System.out.println("Dealer bust with " + this.dealer.getSum());
                    isThereWinner = true;
                    break;
                }

            } else {
                System.out.println("Dealer is holding");
            }

            if (this.dealer.isHolding() == true && this.player.isHolding() == true) {
                isEnded = true;
            }
        }
        System.out.println(this.player);
        System.out.println(this.dealer);

            if (isThereWinner == false) {
                if (this.player.getSum() == this.dealer.getSum()) {
                    this.player.resetGame();
                    this.dealer.resetGame();
                    return "Draw";
                }

                if (this.dealer.getSum() < this.player.getSum()) {
                    winners += this.player.getName() + " ";
                } else {
                    winners += this.dealer.getName() + " ";
                }
            }
        this.player.resetGame();
        this.dealer.resetGame();

        return "The winner is: " + winners;
    }
}