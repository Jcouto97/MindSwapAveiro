package academy.mindswap.module1.supernaturals;

import supernaturals.strikeable.monsters.Monster;
import supernaturals.strikeable.monsters.Mummy;
import supernaturals.strikeable.monsters.Vampire;
import supernaturals.strikeable.monsters.Werewolf;


public class Player {
    private String name;
    private int numberOfMonsters;
    private Monster[] monsters;
    private Monster monsterInHand;

    public Player(String name) {
        this.name = name;
    }

    public int chooseNumberOfMonsters(int min, int max) {
        return Helpers.chooseRandomNumber(min, max);
    }

    public void generateHandOfCards() {


        createMonsterArray();

        Monster[] arrayOfMonsters = new Monster[this.numberOfMonsters]; //criamos vetor novo , como transferiu para monsters? Porque nao por logo no vetor monster?
        for (int i = 0; i < this.numberOfMonsters; i++) {
            Monster monster = this.createAMonster();
            arrayOfMonsters[i] = monster;
        }

        this.addMonsters(arrayOfMonsters); // ??
    }


    public void addMonsters(Monster[] monsters) {
        this.monsters = monsters;
    }

    public Monster createAMonster() {
        int num = Helpers.chooseRandomNumber(0, 2); //usar enums???
        switch (num) {
            case 0:
                return new Werewolf();
            case 1:
                return new Vampire();
            default:
                return new Mummy();
        }
    }

    public boolean isDead() {
        for (Monster monster : this.monsters) {
            if (!monster.isDead())  //se nao houver monstros vivos
                return false;
        }
        return true;
    }

    public boolean isAlive() {
        return !isDead();
    }


    public void createMonsterArray() {
        this.monsters = new Monster[this.numberOfMonsters];
    }


    public void setNumberOfMonsters(int numberOfMonsters) {
        this.numberOfMonsters = numberOfMonsters;
    }

    public void printMonsterArray() {
        System.out.print(this.name + " have in hand: ");
        for (Monster monster : monsters) {
            System.out.print(monster.getType() + " ");
        }
        System.out.println();
    }

    public int attack() {
        this.monsterInHand = getMonster();
        System.out.print(this.name + "'s ");
        this.monsterInHand.attack(); //como vai para a referencia da super?
        return this.monsterInHand.getHitPower();
    }

    public Monster getMonster() {
        int monsterId;
        do {
            monsterId = Helpers.chooseRandomNumber(0, monsters.length - 1);
        } while (monsters[monsterId].isDead());   //se estiver vivo codigo continua
        return this.monsterInHand = monsters[monsterId];

    }

    public String getName() {
        return name;
    }

    public Monster[] getMonsters() {
        return monsters;
    }
}