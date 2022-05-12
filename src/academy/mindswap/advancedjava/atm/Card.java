package academy.mindswap.advancedjava.atm;

public class Card {
    private int pin;
    private int currentMoney;
    private int numberOfTries;
    private boolean isCardBlocked;


    public Card(int pin, int currentMoney) {
        this.pin = pin;
        this.currentMoney = currentMoney;
    }

    public int getPin() {
        return pin;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    public void increaseNumberOfTries() {
        this.numberOfTries++;
    }

    public boolean isCardBlocked() {
        return isCardBlocked;
    }

    public void setCardBlocked(boolean cardBlocked) {
        isCardBlocked = cardBlocked;
    }
}
