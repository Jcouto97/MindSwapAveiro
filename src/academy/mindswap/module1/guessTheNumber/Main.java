package academy.mindswap.module1.guessTheNumber;

public class Main {

    public static void main(String[] args) {
        Player p1 = new Player("Ana");
        Player p2 = new Player("Joao");

        Computer c1 = new Computer("windows");

        Game g1 = new Game(p1, p2, c1);
        System.out.println(g1.play());
    }
}
