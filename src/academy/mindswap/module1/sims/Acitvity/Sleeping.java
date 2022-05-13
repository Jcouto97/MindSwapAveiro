package academy.mindswap.module1.sims.Acitvity;

public class Sleeping extends Activity{

    private final int MAX_ENERGY = 100;

    public Sleeping() {
    super();
    this.setActivityType(AllActivities.SLEEPING);
    }

 @Override
    public int doActivities() {
        System.out.println("Sleeping");
        return MAX_ENERGY;
    }
}
