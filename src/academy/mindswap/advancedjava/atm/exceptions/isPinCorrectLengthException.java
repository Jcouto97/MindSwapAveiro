package academy.mindswap.advancedjava.atm.exceptions;

public class isPinCorrectLengthException extends Exception{
    public isPinCorrectLengthException() {
        super("Pin must have 4 digits");
    }
}
