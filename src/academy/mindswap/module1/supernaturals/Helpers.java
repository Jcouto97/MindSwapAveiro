package academy.mindswap.module1.supernaturals;

public class Helpers {

    public static int chooseRandomNumber(int minNumber, int maxNumber) {
        return ((int) (Math.random() * (maxNumber - minNumber + 1) + minNumber));
    }
}

