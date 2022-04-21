package academy.mindswap.module1.animals;

public class Cat extends Animal{

    private String eyeColor; //criado +1 atributo alem dos Animal
    private boolean wild; //como atributos privados temos que os criar com setters (SEMPRE? OU ABAIXO NO CONSTRUTOR?) e permitir que os venham buscar com getters
                            //com o set permito que instancias cat fora da classe cat permitam alterar valores de atributos
    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public boolean isWild() {
        return wild;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }


    public String getEyeColor() {
        return eyeColor;
    }

    public Cat(String name) { //constructor
        super(name);
        this.wild = false;
        this.eyeColor = "blue";

    }
    //override constructor, SEM ESCREVER @OVERRIDE?
    public Cat(String name, String eyeColor, boolean wild) { //as instancias herdam recebem os atributos do construtor e utilizam os metodos das classes que as instanciaram
        super(name);
        this.eyeColor = eyeColor;
        this.wild = wild;
    }


        @Override
    public void makeNoise() {
        System.out.println("Meow Meow");
    }
}

