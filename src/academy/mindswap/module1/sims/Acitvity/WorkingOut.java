package academy.mindswap.module1.sims.Acitvity;

public class WorkingOut extends Activity{

    public WorkingOut() {
        super();
        this.setActivityType(AllActivities.WORKINGOUT);
    }

    @Override
    public int doActivities() {
        System.out.println("Working Out");
        return -40;
    }
}
