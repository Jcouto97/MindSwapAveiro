package academy.mindswap.advancedjava.atm.exceptions;

public class isCardBlockedException extends Exception{

    public isCardBlockedException() {
        super("This card has been block due to number of tries");
    }
}
