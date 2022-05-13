package academy.mindswap.module1.sims.Acitvity;

public class Activity {

    private int energyNeededForActivity;
    private AllActivities activityType;

    public Activity() {
    }

    public AllActivities getActivityType() {
        return activityType;
    }

    public void setActivityType(AllActivities activityType) {
        this.activityType = activityType;
    }

    public int doActivities(){
    return 0;
    }

    public int getEnergyNeededForActivity() {
        return energyNeededForActivity;
    }

    public void setEnergyNeededForActivity(int energyNeededForActivity) {
        this.energyNeededForActivity = energyNeededForActivity;
    }
}
