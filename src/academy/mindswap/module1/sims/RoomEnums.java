package academy.mindswap.module1.sims;

import sims.Acitvity.*;

public enum RoomEnums {

    BEDROOM(new Activity[]{new Sleeping()}, 2),
    BATHROOM(new Activity[]{new GoToBathroom()}, 10),
    OFFICE(new Activity[]{new Working()}, 5),
    GYM(new Activity[]{new WorkingOut()}, 30),
    KITCHEN(new Activity[]{new Eating()}, 20),
    ;

    private Activity [] activities;
    private int dirtinessLevel;


    RoomEnums(Activity[] activities, int dirtinessLevel) {
        this.activities = activities;
        this.dirtinessLevel = dirtinessLevel;
    }

    public Activity[] getActivities() {
        return activities;
    }

    public int getDirtinessLevel() {
        return dirtinessLevel;
    }


}
