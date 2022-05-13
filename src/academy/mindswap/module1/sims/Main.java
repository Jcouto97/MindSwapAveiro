package academy.mindswap.module1.sims;

import sims.Player.FunnyPlayer;
import sims.Player.SimsCharacter;

import static sims.Acitvity.AllActivities.*;

public class Main {
    public static void main(String[] args) {
        SimsCharacter sim1 = new FunnyPlayer("Nuno");
        SimsCharacter sim2 = new FunnyPlayer("Joao");
        House house1 = new House(new RoomEnums[]{RoomEnums.BEDROOM, RoomEnums.BATHROOM, RoomEnums.KITCHEN, RoomEnums.OFFICE});
        House house2 = new House(new RoomEnums[]{RoomEnums.BEDROOM, RoomEnums.BATHROOM, RoomEnums.KITCHEN, RoomEnums.GYM});
        House house3 = new House(new RoomEnums[]{RoomEnums.BEDROOM, RoomEnums.BATHROOM, RoomEnums.KITCHEN});

        SimsGame game1 = new SimsGame(new House[]{house1, house2, house3},
                new SimsCharacter[]{sim1, sim2},
                new Maid[]{new Maid("Maria"), new Maid("Consuela"), new Maid("Vera")});

        sim1.askIfFreeHouse(game1);
        sim1.askIfFreeMaid(game1);
        sim1.buyHouse(game1, 1);
        sim1.enterHouse();
        sim1.enterRoom(RoomEnums.GYM);
        for (int i = 0; i < 6; i++) {
            sim1.doActivity(WORKINGOUT);
            System.out.println(sim1.getHouse().getCleanlinessLevel()+ " clean level");
            System.out.println(sim1.getEnergyLevel() + " energy lvl ");
        }
        sim1.exitRoom();
        sim1.enterRoom(RoomEnums.BEDROOM);
        sim1.doActivity(SLEEPING);

        System.out.println(sim1.getEnergyLevel() + " energy lvl ");
//        sim1.hireMaid(game1, 0);
//        sim1.payMaidAndClean();
//        for (int i = 0; i < 6; i++) {
//            sim1.doActivity(EATING);
//            System.out.println(sim1.getHouse().getCleanlinessLevel());
//        }
////        sim1.enterHouse();
////        //sim1.getHouse().getRooms()[1].activities[0].doActivities(); //print?
////
////        sim1.enterRoom(RoomEnums.BEDROOM);
////        sim1.doActivity(SLEEPING);
//////        sim1.exitRoom();
//////        sim1.exitHouse();


    }
}
