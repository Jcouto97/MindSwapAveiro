package academy.mindswap.advancedjava.streams11

public class Carro {
  /*  public static void main(String[] args){
        if(args.length> 0 ){
            String firstArg = args[0];
            String secondArg = args[1];
            System.out.println("Olá" + firstArg + " " + secondArg);
            return;
        }
        System.out.println("No args");
    }*/

    public static void main(String[] args) {
        new Carro().vouImplementar();
    }

    void vouImplementar(){

        System.out.println("Vou usar o metodo que aceita um interface");
       // MyInterface object =
        usoInterface( new MyInterface() {
            @Override
            public void tensQueImplementar() {

            }

            @Override
            public void tambemTensQueMeImplementar() {

            }
        });
        System.out.println("O metodo foi executado");
    }

    void usoInterface(MyInterface myInterface){
        System.out.println("vai comecar");
        myInterface.tambemTensQueMeImplementar();
        myInterface.tensQueImplementar();
        System.out.println("Acabou");
    }
}
