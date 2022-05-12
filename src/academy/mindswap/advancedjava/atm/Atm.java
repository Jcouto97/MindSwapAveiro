package academy.mindswap.advancedjava.atm;

import atm.exceptions.*;

public class Atm {
    private Card card;
    private boolean isPinAccepted = false;

    public void insertedCard(Card card) {
        if (this.card != null) {
            System.out.println("There is already a card");
        } else {
            this.card = card;
            System.out.println("A card has been inserted");
        }
    }

    public void drawMoney(String amount) {
        try {
            int amountToNumber = Integer.parseInt(amount);
            validateIfPinAccepted();
            validateMoneyAmount(amountToNumber);
            this.card.setCurrentMoney(this.card.getCurrentMoney() - amountToNumber);
            System.out.println(amount + " has been drawn");
        } catch (isCardBlockedException | NullPointerException | isThereEnoughMoneyException | isPinAcceptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void validateMoneyAmount(int amount) throws isThereEnoughMoneyException, isCardBlockedException {
        if (this.card.getCurrentMoney() - amount < 0) {
            throw new isThereEnoughMoneyException();
        }
        if (this.card.isCardBlocked()){
            throw new isCardBlockedException();
        }
    }

    public void typePin(String pin) {
        try {
            int pinToNumber = Integer.parseInt(pin);
            authentication(pinToNumber);
            this.card.setNumberOfTries(0);
            this.isPinAccepted = true;
        } catch (isCardBlockedException e) {
            System.out.println(e.getMessage());
            this.card.setCardBlocked(true);
            this.card = null;
        } catch (isPinCorrectException | NumberFormatException e) { //duas exceçoes no mesmo catch
            System.out.println(e.getMessage());
            this.card.increaseNumberOfTries();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void authentication(int pin) throws isCardBlockedException, isPinCorrectException {
        if (this.card.getNumberOfTries() >= 3) {
            throw new isCardBlockedException();
        }
        if (pin != this.card.getPin()) {
            throw new isPinCorrectException();
        }
        if (this.isPinAccepted){
            System.out.println("Pin already inserted");
        }

        System.out.println("Pin has been inserted");
    }

    public void deposit(String money){
        try{
            validateIfPinAccepted();
            int moneyToInt = Integer.parseInt(money);
            checkIfNegativeAmount(moneyToInt);
            this.card.setCurrentMoney(this.card.getCurrentMoney()+moneyToInt);
            System.out.println("Deposited " + money);
        }catch(isNegativeNumberException | isPinAcceptedException | NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private void checkIfNegativeAmount(int money) throws isNegativeNumberException{
        if(money<=0){
            throw new isNegativeNumberException();
        }
    }

    public void removeCard() {
        if (this.card == null) {
            System.out.println("There is no card to remove");
        } else {
            System.out.println("Card removed");
            this.card = null;
            this.isPinAccepted = false;
        }
    }

    private void validateIfPinAccepted() throws isPinAcceptedException{
        if(!this.isPinAccepted){
            throw new isPinAcceptedException();
        }
    }
}
