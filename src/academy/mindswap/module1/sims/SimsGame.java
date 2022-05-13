package academy.mindswap.module1.sims;

import sims.Player.SimsCharacter;

public class SimsGame {
    private House[] houses;
    private SimsCharacter[] players;
    private Maid[] maids;

    public SimsGame(House[] houses, SimsCharacter[] players, Maid[] maids) {
        this.houses = houses;
        this.players = players;
        this.maids = maids;
    }

    public House[] getHouses() {
        return houses;
    }

    public House getHouse(int index){
        return houses[index];
    }

    public boolean isHouseOccupied(int index){
        return houses[index].isOccupied();
    }

    public SimsCharacter[] getPlayers() {
        return players;
    }

    public Maid[] getMaids() {
        return maids;
    }
}
