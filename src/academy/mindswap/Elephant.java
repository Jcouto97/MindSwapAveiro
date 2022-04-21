package academy.mindswap;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }
    @Override
    public void makeNoise() {
        System.out.println("The person creating this class has no idea of how an elephant sounds.");
    }
}
