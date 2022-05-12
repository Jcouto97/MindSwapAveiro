package academy.mindswap.module1.supernaturals.fairies;

import academy.mindswap.module1.supernaturals.Supernatural;
import academy.mindswap.module1.supernaturals.SupernaturalType;

public class Fairy extends Supernatural {

    public Fairy() {
        this.setType(SupernaturalType.FAIRY);
        this.setCurrentHealth(this.getMAX_HEALTH());
        this.setHitPower(10);
    }

    @Override
    public void attack() {
        super.attack();
    }


}