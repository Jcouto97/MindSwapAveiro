package academy.mindswap.advancedjava.atm.exceptions;

public class isPinCorrectException extends Exception{
    public isPinCorrectException() {
        super("Inserted pin is invalid");
    }

    public isPinCorrectException(String message) {
        super(message);
    }
}
