package academy.mindswap.advancedjava.atm.exceptions;

public class isCardInsertedException extends Exception {
    public isCardInsertedException() {
        super("The card hasn't been inserted");
    }
}

