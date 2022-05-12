package academy.mindswap.module1.supernaturals;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ala");
        Player player2 = new Player("Joao");

        Game game1 = new Game(player1, player2);

        game1.play();


    }
}