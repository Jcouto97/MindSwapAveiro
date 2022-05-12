package academy.mindswap.module1.supernaturals.strikeable.monsters;

import academy.mindswap.module1.supernaturals.Helpers;

import academy.mindswap.module1.supernaturals.SupernaturalType;

public class Vampire extends Monster {
    private final double chanceOfBite = 0.2;
    private final int biteHealthIncrease = 10;


    public Vampire() {
        this.setHitPower(40);
        this.setType(SupernaturalType.VAMPIRE);

    }

    public void bite() {
        if (getCurrentHealth() >= this.getMAX_HEALTH() - this.biteHealthIncrease) {
            this.setCurrentHealth(100);
        } else {
            System.out.println("Vampire has bitten!");
            this.setCurrentHealth((this.getCurrentHealth() + biteHealthIncrease));
        }
    }

    @Override
    public void attack() {
        int temp = Helpers.chooseRandomNumber(1, 10);
        if (temp < 3) {
            bite();
        } else {
            super.attack();
        }
    }

}
