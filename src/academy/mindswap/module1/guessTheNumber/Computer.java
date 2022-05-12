package academy.mindswap.module1.guessTheNumber;

import static academy.mindswap.module1.guessTheNumber.Utils.generateNewRandomNumber;

public class Computer {

    private String name;
    private int choice;

    public Computer(String name) {
        this.name = name;
        this.choice=generateNewRandomNumber();
    }


    public String getName() {
        return name;
    }

    public int getChoice() {
        return choice;
    }
}