package academy.mindswap.module1.animals;

public class Pig extends Animal {
    public Pig(String name) {
        super(name); //vais buscar todos os atributos e metodos
    }

    @Override
    public void makeNoise() {
        System.out.println("Oink, oink, oink.");
    }

}