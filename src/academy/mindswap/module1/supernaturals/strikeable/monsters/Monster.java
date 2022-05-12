package academy.mindswap.module1.supernaturals.strikeable.monsters;

import academy.mindswap.module1.supernaturals.Supernatural;
import academy.mindswap.module1.supernaturals.strikeable.Strikeable;

public abstract class Monster extends Supernatural implements Strikeable {

    boolean dead;

    public Monster() {
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
        if (this.getCurrentHealth() <= strikePower) {
            this.setDead();
            this.setCurrentHealth(0);
            System.out.println(this.getType() + " died with the death strike.");
            return;
        }
        this.setCurrentHealth(this.getCurrentHealth() - strikePower);
        System.out.println(this.getType() + " lost " + strikePower + " life points.");
    }


}