package academy.mindswap.module1.supernaturals;


import supernaturals.fairies.Fairy;
import academy.mindswap.module1.supernaturals.strikeable.Witch;
import academy.mindswap.module1.supernaturals.strikeable.monsters.Monster;

public class Game {
    private Player playerA;
    private Player playerB;
    private int numberOfRounds;
    //private SupernaturalType[] monsterList = {SupernaturalType.MUMMY, SupernaturalType.VAMPIRE, SupernaturalType.WEREWOLF};
    private SupernaturalType[] obstacles = {SupernaturalType.WITCH, SupernaturalType.FAIRY};
    private double probabilityOfObstacle = 0.4;

    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void startGame() {
        System.out.println("\nLet's start the game! \nFirst, let's draw a number of starting cards...");
        boolean isStoped = false;
        while (!isStoped) {     //ao contrario??

            int numberPlayerA = playerA.chooseNumberOfMonsters(1, 5);
            int numberPlayerB = playerB.chooseNumberOfMonsters(1, 5);

            System.out.print("Player A draws: " + numberPlayerA + "; ");
            System.out.println("Player B draws: " + numberPlayerB + "; ");


            if (numberPlayerA == numberPlayerB) {
                System.out.println("\nGreat! Both players drew number " + numberPlayerA + "! \n");

                playerA.setNumberOfMonsters(numberPlayerA); //guardar no atributo de player
                playerB.setNumberOfMonsters(numberPlayerB);

                playerA.generateHandOfCards(); //criar array de monstros com nr anterior + monstros random
                playerB.generateHandOfCards();

                playerA.printMonsterArray();
                playerB.printMonsterArray();
                isStoped = true;
            }

        }


    }

//       public Player chooseStartingPlayer() {     //ja nao vemos quem começa?
//            int temp = Helpers.chooseRandomNumber(1, 2);
//            if (temp == 1) {
//                return this.playerA;
//            } else {
//                return this.playerB;
//            }
//
//        }
//
//        public Player secondStartingPlayer(){
//            if(chooseStartingPlayer() == this.playerA){
//                return this.playerB;
//            }else{
//                return this.playerA;
//            }
//    }



    public void play() {
        numberOfRounds = 0;
        startGame();
        //chooseStartingPlayer();

        // !false && !false = true && true = true // os dois jogadores tem pelo menos um monstro vivo
        // !true && !false = false && true = false // um jogador não tem nenhum monstro vivo
        while (checkIfTheGameContinues()) {
            System.out.println("\n" + "------ROUND NUMBER " + (numberOfRounds + 1) + "------" + "\n");
            if (numberOfRounds % 2 == 0) {
                playRound(this.playerA, this.playerB);
            } else {
                playRound(this.playerB, this.playerA);
            }

        }
        if (this.playerA.isDead()) {
            System.out.println("\n" + "The winner is " + this.playerB.getName() + "!");
        } else {
            System.out.println("\n" + "The winner is " + this.playerA.getName() + "!");
        }

    }

    private boolean checkIfTheGameContinues() {
        return this.playerA.isAlive() && this.playerB.isAlive();
    }

    public void playRound(Player attacker, Player defender) {
        if (isObstacleThrown()) {
            obstacleAttackPlayers(attacker, defender);

        }
        if (checkIfTheGameContinues()) {
            System.out.println("\nGo " + attacker.getName() + "!");
            defender.getMonster().looseHealth(attacker.attack());
            numberOfRounds++;
            printPlayersStats(playerA);
            printPlayersStats(playerB);
        }
    }

    private void obstacleAttackPlayers(Player attacker, Player defender) {
        Supernatural obstacle = createAnObstacle();
        System.out.println("An obstacle is thrown! It is a " + obstacle.getType() + "! Because of the obstacle:");
        defender.getMonster().looseHealth(obstacle.getHitPower());
        attacker.getMonster().looseHealth(obstacle.getHitPower());
    }

    private void printPlayersStats(Player player) {
        System.out.println("\n" + player.getName() + " finished this round with following cards:");
        for (Monster monsterCard : player.getMonsters()) {
            System.out.print(monsterCard.getType() + ": " + monsterCard.getCurrentHealth() + " life points" + "\t\t");
        }
        System.out.println("");
    }

    private boolean isObstacleThrown() {
        double probability = Math.random();
        if (probability < this.probabilityOfObstacle) {
            return true;
        }
        return false;
    }


    private Supernatural createAnObstacle() {
        int num = Helpers.chooseRandomNumber(0, 1);
        SupernaturalType obstacle = this.obstacles[num];
        switch (obstacle) {
            case FAIRY:
                return new Fairy();
            default:
                return new Witch();
        }
    }


}

