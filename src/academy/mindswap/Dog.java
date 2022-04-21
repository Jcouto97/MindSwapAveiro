package academy.mindswap;

public class Dog extends Animal {
    private String breed;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    @Override
    public void makeNoise() {
        System.out.println("Woof, woof, woof.");
    }
    public void runAfterMailman(){
        System.out.println("I HATE YOU! WOOFF! GET OUT OF MY STREET! WOOF!");
    }
}