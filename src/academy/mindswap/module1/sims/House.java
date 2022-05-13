package academy.mindswap.module1.sims;

public class House {

    private final int MAX_CLEANLINESS = 100;
    private int cleanlinessLevel = MAX_CLEANLINESS;
    private RoomEnums[] rooms;
    private boolean occupied;

    public House(RoomEnums[] rooms) {
        this.rooms = new RoomEnums[rooms.length]; //consoante length do enums
        for (int i = 0; i < rooms.length; i++) {
            this.rooms[i] = rooms[i];
        }
    }

    public RoomEnums[] getRooms() {
        return rooms;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void decreaseHouseCleanliness(int dirtiness){
        this.cleanlinessLevel -= dirtiness;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = cleanlinessLevel;
    }

    public int getMAX_CLEANLINESS() {
        return MAX_CLEANLINESS;
    }
}
