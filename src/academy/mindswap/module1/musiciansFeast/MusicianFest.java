package academy.mindswap.module1.musiciansFeast;





public class MusicianFest {
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