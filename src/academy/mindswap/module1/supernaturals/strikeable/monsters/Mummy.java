package academy.mindswap.module1.supernaturals.strikeable.monsters;

import academy.mindswap.module1.supernaturals.SupernaturalType;

public class Mummy extends Monster {
    private int countSuccessiveAttacks;

    public Mummy() {
        this.setHitPower(20);
        this.setType(SupernaturalType.MUMMY);
    }

    public void failedAttack() {
        if (this.countSuccessiveAttacks == 3) {
            System.out.println("Failed attack!");
            this.setCurrentHealth(this.getCurrentHealth() - 10);
            this.countSuccessiveAttacks = 0;
        }
        if (this.getCurrentHealth() <= 0) {
            this.setDead();
        }
    }

    @Override
    public void attack() {
        super.attack();
        this.countSuccessiveAttacks++;
        System.out.println("Mummy attacks! It was attack number " + this.countSuccessiveAttacks + ".");
        failedAttack();
    }
}