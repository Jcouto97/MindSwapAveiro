package academy.mindswap.module1.sims;

public class Maid {
    private String name;
    private boolean isPaid;
    private boolean isMaidAvailable;

    public Maid(String name) {
        this.name = name;
        this.isMaidAvailable = true;
    }

    public void clean(House house){
        System.out.println("Maid cleaned the house");
        house.setCleanlinessLevel(house.getMAX_CLEANLINESS());
    }

    public boolean isMaidAvailable() {
        return isMaidAvailable;
    }

    public void setMaidAvailable(boolean maidAvailable) {
        isMaidAvailable = maidAvailable;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
