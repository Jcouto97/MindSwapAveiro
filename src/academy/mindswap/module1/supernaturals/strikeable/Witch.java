package academy.mindswap.module1.supernaturals.strikeable;


import academy.mindswap.module1.supernaturals.Supernatural;
import academy.mindswap.module1.supernaturals.SupernaturalType;

public class Witch extends Supernatural implements Strikeable {

    boolean dead;

    public Witch() {
        this.setType(SupernaturalType.WITCH);
        this.setHitPower(30);
    }

    @Override
    public boolean isDead() {
        return this.dead;
    }

    @Override
    public void setDead() {
        this.dead = true;
    }

    @Override
    public void looseHealth(int strikePower) {
        if (this.getCurrentHealth() < strikePower / 2) {
            this.setDead();
            this.setCurrentHealth(0);
            System.out.println("Witch died with the death strike!");
            return;
        }
        this.setCurrentHealth(this.getCurrentHealth() - strikePower / 2);
        System.out.println("Witch lost " + strikePower / 2 + " life points!");
    }


}