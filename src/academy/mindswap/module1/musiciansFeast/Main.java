package academy.mindswap.module1.musiciansFeast;

import java.util.Locale;

public class Main {

        public static void main(String[] args) {
            System.out.println(testDish("Bob Dylan", "beef wellington")); // should print true   //PERCEBER ESTA ESTRUTURA
            System.out.println(testDish("Mick Jagger", "mushroom soup")); // should print false
        }

        public static boolean testDish(String musicianName, String dish) {
            return musicianName.toLowerCase().charAt(0) == dish.charAt(0) && musicianName.charAt(musicianName.length()-1) == dish.charAt(dish.length()-1);
        }




       /* public static void main(String[] args){
                System.out.println(generatePassword("Peter Gabriel")); // should print "G@br!el"
                System.out.println(generatePassword("Brian Adams")); // should print "@d@ms"
        }
        public static String generatePassword(String musicianName){

            return musicianName.split(" ")[1].replaceAll("[Aa]", "@").replaceAll("[Ii]", "!");

        }*/






/*
    The party is coming to an end, and the last musicians are leaving the venue when
the staff calls them to help clean up the place.
No one wants to do it, so a plan takes form: they will all line up, and a staff member
will think of a random number between 10 and 15 to give each artist. If the
musician's name has more letters than the picked number, that musician gets
*/


    public static String pickMusician(String[] musicians) {
        int rand;
        int count = 0;
        int max = 15;
        int min = 10;

        String cleaner = "";
        //int musiciansLetters;

        for (int i = 0; i < musicians.length; i++) {

            rand = (int) (Math.random() * (max - min + 1) + min);
            // musiciansLetters = musicians[i].length() - 1;

            if (musicians[i].replaceAll(" ", "").length() > rand) {
                cleaner += musicians[i] + " with the random number " + rand + "\n";
                count++;
            }
        }
        if (count == 0) {
            return "Nobody cleans!";
        } else if (count == 1) {
            return cleaner += "Will clean alone.";
        }
        return cleaner += "Will clean together.";
    }
}


