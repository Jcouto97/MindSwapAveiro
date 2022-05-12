package academy.mindswap.module1.supernaturals;

public abstract class Supernatural {

    private int hitPower;
    private final int MAX_HEALTH = 100;
    private int currentHealth = MAX_HEALTH;
    private SupernaturalType type;

    public Supernatural() {
    }

    public void attack() {
        System.out.println(this.type + " is attacking!");
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getHitPower() {
        return hitPower;
    }

    public void setHitPower(int hitPower) {
        this.hitPower = hitPower;
    }

    public void setCurrentHealth(int health) {
        this.currentHealth = health;
    }

    public int getMAX_HEALTH() {
        return MAX_HEALTH;
    }



    public void setType(SupernaturalType type) {
        this.type = type;
    }

    public SupernaturalType getType() {
        return type;
    }
}