package academy.mindswap.advancedjava.atm;

public class Main {
    public static void main(String[] args) {
        Atm atm1 = new Atm();
        Card card1 = new Card(1234, 500);

        atm1.insertedCard(card1);
        atm1.typePin("1234");
        atm1.deposit("200");
        System.out.println(card1.getCurrentMoney());
        atm1.drawMoney("300");
        System.out.println(card1.getCurrentMoney());
        atm1.removeCard();

        //        atm.drawMoney(20);
//        atm.deposit("200");
//        System.out.println(card1.getCurrentMoney());
//        atm.drawMoney(20);
//        atm.removeCard();
//        atm.drawMoney(20);

        /*
        criar cliente
        criar atm

        metodos com exceçoes:
        atm verifica pin incorreto (3x com contador que bloqueia cartao ou da reset)
        levantar demasiado dinheiro
        levantar dinheiro negativo
        introduzir letras no pin
        introduzir letras no levantamento
         */


    }
}
