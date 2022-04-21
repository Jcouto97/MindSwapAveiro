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




        public static void main(String[] args){
                System.out.println(generatePassword("Peter Gabriel")); // should print "G@br!el"
                System.out.println(generatePassword("Brian Adams")); // should print "@d@ms"
        }
        public static String generatePassword(String musicianName){

            return musicianName.split(" ")[1].replaceAll("[Aa]", "@").replaceAll("[Ii]", "!");

        }


    public class MusicalFeastNumber {
        public static void main(String[] args) {
            System.out.println(findStolenNumber(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10})); // should print 4
            System.out.println(findStolenNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})); // should print 9
            System.out.println(findStolenNumber(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10})); // should print "no number was stolen"
            System.out.println(findStolenNumber(new int[]{8, 5, 9, 6, 2, 4, 1, 3, 7}));
        }

        private static String findStolenNumber(int[] ints) {
            int[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            boolean found = false;
            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < ints.length; j++) {
                    if (temp[i] == ints[j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    return "The stolen number is " + temp[i];
                }
                found = false;

            }
            return "No number was stolen";
        }
    }
}


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


