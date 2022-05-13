package academy.mindswap.module1.sims.Acitvity;

public class Eating extends Activity{
    public Eating() {
        super();
        this.setActivityType(AllActivities.EATING);
    }

    @Override
    public int doActivities() {
        System.out.println("yum");
        return 0;
    }
}
