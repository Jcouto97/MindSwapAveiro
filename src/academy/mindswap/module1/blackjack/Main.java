package academy.mindswap.module1.blackjack;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Joao", 18);
        Player player2 = new Player("Dealer", 17);

        Game game1 = new Game(player1, player2);

        for (int i = 0; i < 10; i++) {
            System.out.println(game1.play());
        }
    }
}
