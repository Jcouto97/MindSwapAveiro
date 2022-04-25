package academy.mindswap.module1.blackjack;
public class Player {
    private String name;
    private int sum;
    private int maxValue;
    private boolean isHolding;


    public Player(String name, int maxValue) {
        this.name = name;
        this.sum = 0;
        this.maxValue = maxValue;
        this.isHolding = false;

    }

    public String getName() {
        return this.name;
    }

    public boolean aboveMax(){
        if(this.sum>=this.maxValue){
            this.isHolding= true;
        }
        return this.isHolding;
    }

    public int askNewCard(){
        int cardValue= Deck.sortCard();
        this.sum += cardValue;
        return cardValue;
    }

    public boolean isHolding() {
        return this.isHolding;
    }

    public int getSum() {
        return this.sum;
    }

    public void resetGame(){
        this.sum = 0;
        this.isHolding = false;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                ", maxValue=" + maxValue +
                ", isHolding=" + isHolding +
                '}';
    }
}
