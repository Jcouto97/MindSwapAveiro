package academy.mindswap.module1.sims.Player;

import sims.Acitvity.AllActivities;
import sims.House;
import sims.Maid;
import sims.RoomEnums;
import sims.SimsGame;

public abstract class SimsCharacter {
    private String name;
    private House house;
    private final int MAX_ENERGY_LEVEL = 100;
    private int energyLevel = MAX_ENERGY_LEVEL;
    private boolean insideHouse;
    private RoomEnums roomType;
    private Maid maid;

    public SimsCharacter(String name) {
        this.name = name;
    }



    public void buyHouse(SimsGame game, int index) {
        if (this.house == null && !game.isHouseOccupied(index)) {
            this.house = game.getHouse(index);
            this.house.setOccupied(true);
            System.out.println("You have now bought a house!");
            return;
        }
        System.out.println("You cant buy this house");
    }

    public void askIfFreeHouse(SimsGame game) {
        for (int i = 0; i < game.getHouses().length; i++) {
           // if (!game.getHouse(i).isOccupied()) {
             if (!game.isHouseOccupied(i)) {
                System.out.println("House from index " + i + " is free");
            }
        }
    }

    private boolean hasHouse() {
        if (this.house != null) {
            //      System.out.println("You bought a house");
            return true;
        }
        //System.out.println("You didnt bought a house");
        return false;
    }

    private boolean isOutside() {
        if (!this.isInsideHouse()) {
            //       System.out.println("You are already inside the house");
            return true;
        }
        //     System.out.println("You are outside the house");
        return false;
    }

    public void enterHouse() {
        if (!this.hasHouse()) return;
        if (!this.isOutside()) return;
        this.insideHouse = true;
        System.out.println("You have entered your house!");
    }


    public void exitHouse() {
        if (!hasHouse()) return;
        if (this.isOutside()) return;
        System.out.println("You have exited your house!");
        this.insideHouse = false;
    }

    public House getHouse() {
        return house;
    }

    private boolean checkAlreadyOutsideRoom() {
        if (this.roomType == null) {
            System.out.println("You are already outside of a room");
            return true;
        }
        return false;
    }

    private boolean checkAlreadyInsideRoom() {
        if (this.roomType != null) {
            System.out.println("You are already inside of a room");
            return true;
        }
        return false;
    }

    private boolean checkIfRoomExists(RoomEnums room) {
        for (RoomEnums houseRoom : this.house.getRooms()) {
            if (houseRoom == room) {
                return true;
            }
        }
        System.out.println("Room doesnt exist in the house");
        return false;
    }

    public void enterRoom(RoomEnums room) {
        if (!this.hasHouse()) return;
        if (this.isOutside()) return;
        if (this.checkAlreadyInsideRoom()) return;
        if (!this.checkIfRoomExists(room)) return;
        this.roomType = room;
        System.out.println("You entered the " + this.roomType);
    }

    public void exitRoom() {
        if (!this.hasHouse()) return;
        if (this.isOutside()) return;
        if (this.checkAlreadyOutsideRoom()) return;
        System.out.println("You exited " + this.roomType);
        this.roomType = null;
    }

    public boolean isHouseFullDirty() {
        if (this.house.getCleanlinessLevel() <= 0) {
            System.out.println("Get a maid, house is fully dirty");
            return true;
        }
        return false;
    }

    public void doActivity(AllActivities activity) {
        if (!this.hasHouse()) return;
        if (this.isOutside()) return;
        if (this.checkAlreadyOutsideRoom()) return;
        if (isHouseFullDirty()) return;
        if(activity != AllActivities.SLEEPING) {
            if (this.getEnergyLevel() == 0) {
                System.out.println("you need to sleep");
                return;
            }
        }

        for (int i = 0; i < this.roomType.getActivities().length; i++) { //iterar sobre o array de atividades na room onde estou
            if (this.roomType.getActivities()[i].getActivityType() == activity) { //comparar os elementos das atividades com a atividade do parametro

                this.useEnergy(this.roomType.getActivities()[i].doActivities());
                ; //se true fazer atividade, senao print em baixo
                this.house.decreaseHouseCleanliness(this.roomType.getDirtinessLevel()); //sempre que atividade decrease cleanliness consoante dirtinesseLevel dos enums
                return;
            }
        }
        System.out.println("This room doesn't have this activity");
    }

    //setters e getters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public int getMAX_ENERGY_LEVEL() {
        return MAX_ENERGY_LEVEL;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public boolean isInsideHouse() {
        return insideHouse;
    }

    public void setInsideHouse(boolean insideHouse) {
        this.insideHouse = insideHouse;
    }

    public boolean returnHouse() {
        if (!this.hasHouse()) return false;
        if (!this.isOutside()) return false;

        this.house.setOccupied(false);
        this.house = null;

        return true;
    }

    public void askIfFreeMaid(SimsGame game) {
        for (int i = 0; i < game.getMaids().length; i++) {
            if (game.getMaids()[i].isMaidAvailable()) {
                System.out.println("Maid from index " + i + " is available");
            }
        }
    }

    public void hireMaid(SimsGame game, int index) {
        if (!this.hasHouse()) return;
        if (game.getMaids().length <= index) return;
        if (this.maid == null) {
            System.out.println("You have hired the maid");
            this.maid = game.getMaids()[index];
            this.maid.setMaidAvailable(false);
        }
    }

    public void payMaidAndClean() {
        if (this.maid != null) {
            System.out.println("Maid has been paid");
            this.maid.setPaid(true);
            this.maid.clean(this.getHouse());
        }
    }

    public void useEnergy(int energyUsed) {
        this.energyLevel += energyUsed;
        if (this.energyLevel <= 0) {
            this.energyLevel = 0;
        }
        if (this.energyLevel > 100) {
            this.energyLevel = MAX_ENERGY_LEVEL;
        }
    }
}
