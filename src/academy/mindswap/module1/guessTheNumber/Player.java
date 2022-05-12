package academy.mindswap.module1.guessTheNumber;

import static academy.mindswap.module1.guessTheNumber.Utils.generateNewRandomNumber;

public class Player {

    private String name;
    private int choice;

    public Player(String name) {
        this.name = name;
       this.getNewNumber();
    }



    public void getNewNumber() {
        this.choice = generateNewRandomNumber();
    }

    public String getName() {
        return name;
    }

    public int getChoice() {
        return choice;
    }
}
