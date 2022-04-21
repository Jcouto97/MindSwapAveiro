package academy.mindswap;

public class Animal {
    private int age;
    private int hungerLevel;
    private String name;

    public Animal(String name) { //construtor com valores hungerLeve e age atribuidos de 0 por base
        this.name = name;
        hungerLevel = 0;
        age = 0;
    }
    public void eat(String food) {
        if (hungerLevel <= 10) {
            System.out.println("Thanks, but no. Thanks.");
            return;
        }
        System.out.println("Yum, yum, yum... This is some delicious " + food + "!");
    }
    public void getOlder() { //metodo para incrementar a idade, sempre que chamada idade + 1
        age++;
    }

    public String getName() {
        return name;
    }

    public int getAge() { //getter para saber a idade
        return age;
    }

    public void makeNoise(){ //vazio porque vamos dar override em cada metodo porque se conmporta de forma diferente para cada animal (override)
    }
}