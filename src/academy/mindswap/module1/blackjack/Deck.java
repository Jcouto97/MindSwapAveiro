package academy.mindswap.module1.blackjack;

public class Deck {
    private static final int[] allCards = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}; //static porque nao preciso instanciar

    public static int sortCard() {
        return allCards[draw()];
    }

    private static int draw(){
        int min = 0;
        int max = allCards.length;
        return (int) ((Math.random()*(max-min))+ min);
    }
}
