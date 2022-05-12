package academy.mindswap.advancedjava.atm.exceptions;

public class isNegativeNumberException extends Exception{
    public isNegativeNumberException (){
        super("Insert only positive numbers");
    }
}
