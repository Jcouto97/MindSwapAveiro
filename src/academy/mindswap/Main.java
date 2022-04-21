package academy.mindswap;

public class Main {

    public static void main(String[] args) {
        Pig pig = new Pig("Peppa");  //utilizadas classes dedicadas
        Elephant elephant = new Elephant("Tobias");
        Dog dog = new Dog("Gucci", "chihuahua");
        Cat cat = new Cat("Joe", "blue", false);

        Animal pig2 = new Pig("Bob");  //criados com classe animal, ficam com a blueprint + generalizada
        Animal elephant2 = new Elephant("Hugo");
        Animal dog2 = new Dog ("Zeus", "Boxer");

        pig.makeNoise();
        elephant.makeNoise();
        dog.makeNoise();
        cat.makeNoise();
        dog.runAfterMailman();
        cat.getOlder();
        System.out.println(cat.getEyeColor());
        cat.setEyeColor("brown"); //set para alterar a atributo do Cat fora da sua classe, imprimir antes e depois com getters
        System.out.println(cat.getEyeColor());

        System.out.println("The cat " + cat.getName() + " has " + cat.getAge() + " year/s.");

        pig2.makeNoise();
        elephant2.makeNoise();
        dog2.makeNoise();
        ((Dog) dog2).runAfterMailman(); //casting porque metodo(ou atributo) foi criado na classe dog e nao na animal (dog2 veio da animal), para isto deve,os evitar criar como animal
        //a nao ser que nao saibamos o tipo de instancia Animal zoo [] e depois atribuiamos zoo[1] = new Pig("Bob") se nao existir ou se existir zoo[1]=Pig("Bob");

// THE eat() METHOD IS DECLARED IN THE SUPERCLASS, BUT EACH SUBTYPE INHERITED ITS IMPLEMENTATION
        pig.eat("potatoes");
        elephant.eat("leaves");
        dog.eat("biscuit");

        pig2.eat("potatoes");
        elephant2.eat("leaves");
        dog2.eat("biscuit");
    }
}