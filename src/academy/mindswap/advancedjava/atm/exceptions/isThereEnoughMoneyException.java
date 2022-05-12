package academy.mindswap.advancedjava.atm.exceptions;

public class isThereEnoughMoneyException extends Exception{
    public isThereEnoughMoneyException() {
        super("You don't have enough money");
    }
}
